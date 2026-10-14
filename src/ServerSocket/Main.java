package ServerSocket;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        ServerSocket server =  new ServerSocket(2341);
        System.out.println("Сервер запущен! На порту: " + server.getLocalPort());
        Socket socket =  server.accept();

        System.out.println("Клиент подключен по адресу: " + socket.getInetAddress());

        BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pt = new PrintWriter(socket.getOutputStream(),true);

        pt.write("Добро пожаловать на сервер!");

        String response = buff.readLine();

        System.out.println(response);


        socket.close();

        server.close();
    }
}
