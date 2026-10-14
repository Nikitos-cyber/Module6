package ClientServerNio;

import OOPTask12.SunSystem;

import java.nio.channels.SocketChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import java.util.Iterator;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream response = new ByteArrayOutputStream(32 * 1024);
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        String request = "GET /HTTP/1.1r\r\n" +
                "Host: localhost\r\n" +
                "Connect: close\r\n" +
                "\r\n";
        ByteBuffer bufferRequest = ByteBuffer.wrap(request.getBytes(StandardCharsets.US_ASCII));
        try (Selector selector = Selector.open();
             SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.configureBlocking(false);
            socketChannel.connect(address);
            socketChannel.register(selector, SelectionKey.OP_CONNECT);

            ByteBuffer bufferRead = ByteBuffer.allocate(8192);
            boolean done = false;
            long deadline = System.currentTimeMillis() + 10_000;

            while (!done && System.currentTimeMillis() < deadline) {
                int ready = selector.select(1000);
                if (ready == 0) continue;

                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();

                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    iterator.remove();

                    if (!key.isValid())
                        continue;

                    if (key.isConnectable()) {
                        SocketChannel ch = (SocketChannel) key.channel();
                        if (ch.finishConnect()) {
                            key.interestOps(SelectionKey.OP_WRITE);
                        } else {
                            key.cancel();
                            done = true;
                        }
                    }

                    if (key.isWritable()) {
                        SocketChannel ch = (SocketChannel) key.channel();
                        while (bufferRequest.hasRemaining()) {
                            int n = socketChannel.write(bufferRequest);
                            if (n == 0)
                                break;

                        }
                        if (!bufferRequest.hasRemaining()) {
                            key.interestOps(SelectionKey.OP_READ);
                        }
                    }

                    if (key.isReadable()) {
                        SocketChannel ch = (SocketChannel) key.channel();
                        while (true) {
                            int n = ch.read(bufferRead);
                            if (n > 0) {
                                bufferRead.flip();
                                response.write(bufferRead.array(), 0, bufferRead.limit());
                                bufferRead.clear();

                            } else if (n == 0) {
                                break;
                            } else {
                                done = true;
                                key.cancel();
                                socketChannel.close();
                                break;
                            }
                        }
                    }
                }

            }


        }

        String textResponse = new String(response.toByteArray(),StandardCharsets.UTF_8);


    }
}
