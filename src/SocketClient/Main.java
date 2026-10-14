package SocketClient;

import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import  java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 2344);
        BufferedReader buff  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

        String response = buff.readLine();
        System.out.println("Сообщение от сервера: " + response);
        writer.write("Принято!");

        socket.close();
    }
}
