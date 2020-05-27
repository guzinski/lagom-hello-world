package com.guzinski.helloworld;

import com.lightbend.lagom.javadsl.testkit.ServiceTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldIntegrationTest {

    @Test
    public void helloWorld_shouldReturnExpectedResult() {
        ServiceTest.withServer(ServiceTest.defaultSetup(), server -> {
            HelloWorldService helloWorldService = server.client(HelloWorldService.class);

            String result = helloWorldService
                .helloWorld()
                .invoke()
                .toCompletableFuture()
                .join();

            assertEquals("Hello World!", result);

        });
    }
}
