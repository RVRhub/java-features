import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientAsync {

    public static void main(String[] args) {
        var httpClient =
                HttpClient.newBuilder()
                        .version(HttpClient.Version.HTTP_2)
                        .build();

        var request = HttpRequest.newBuilder(URI.create("https://google.com"))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> resFuture =
                httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        resFuture.thenAccept(response -> System.out.println(response.version()));
        resFuture.join();
    }
}
