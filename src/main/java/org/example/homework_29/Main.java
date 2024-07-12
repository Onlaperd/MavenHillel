package org.example.homework_29;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;


public class Main {

    public static void main(String[] args) throws URISyntaxException, java.io.IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("========робимо GET запит щоб отримати дані про 1 пост========");
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();
        HttpResponse<String> responseGet = client.send(getRequest, BodyHandlers.ofString());

        POJO response1POJO = mapper.readValue(responseGet.body(), POJO.class);
        System.out.println(response1POJO);


        System.out.println("\n========робимо Post запит щоб зробити ресурс========");

        String json = "{\"title\": \"foo\",\"body\": \"bar\",\"userId\": 1}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
                .headers("Content-Type", "application/json; charset=UTF-8")
                .POST(BodyPublishers.ofString(json))
                .build();

        System.out.println("====відповідь====");
        HttpResponse<String> responsePost = client.send(request, BodyHandlers.ofString());

        POJO pojoResponsePost = mapper.readValue(responsePost.body(), POJO.class);

        System.out.println(pojoResponsePost);

    }
}
