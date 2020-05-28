package com.guzinski.helloworld;

import com.google.inject.internal.cglib.core.internal.$LoadingCache;
import com.lightbend.lagom.javadsl.client.integration.LagomClientFactory;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    private final static String host = "http://localhost:9000";

    public static void main(String[] args) throws URISyntaxException {
        LagomClientFactory helloClient = LagomClientFactory.create(
            "helloClient",
            LagomClientFactory.class.getClassLoader()
        );

        HelloWorldService service = helloClient.createClient(HelloWorldService.class, new URI(host));

        service.helloWorld().invoke()
            .thenAccept(System.out::println)
            .toCompletableFuture().join();

        helloClient.close();
    }
}
