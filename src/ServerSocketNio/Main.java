package ServerSocketNio;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class Main {
    public static void main(String[] args) throws IOException{
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080),0);
        server.createContext("/", Handler::handler);
        ExecutorService executors =  Executors.newFixedThreadPool(10);
        server.setExecutor(executors);
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            server.stop(5);
            executors.shutdown();
        }));
    }
}

class Handler{
    public static void handler(HttpExchange exchange){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();
        try{
            String body = "Hello from local server!\n" +
                    "Time: " + date.format(format) + "\n" +
                    "Path: " + exchange.getRequestURI() + "\n" +
                    "Method: " + exchange.getRequestMethod() + "\n";
            byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type","text/plain; charset=utf-8");
            exchange.sendResponseHeaders(200, bytes.length);
            try(OutputStream out = exchange.getResponseBody();){
                out.write(bytes);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            exchange.close();
        }
    }
}