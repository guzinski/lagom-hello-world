package com.guzinski.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldServiceImplTest {

    @Test
    public void helloWorld_shouldReturnExpectedResult() {
        HelloWorldService helloWorldService = new HelloWorldServiceImpl();

        String result = helloWorldService
            .helloWorld()
            .invoke()
            .toCompletableFuture()
            .join();

        assertEquals("Hello World!", result);
    }
}