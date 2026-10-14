package HhttpNio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://example.com")).GET().build();
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).orTimeout(30, TimeUnit.SECONDS);


        HttpResponse<String> response = future.join();
        System.out.println("Статус: " + response.statusCode());
        System.out.println(response.uri());
        System.out.println(response.headers());
        System.out.println(response.body());
    }
}
