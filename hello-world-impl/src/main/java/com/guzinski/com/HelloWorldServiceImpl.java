package com.guzinski.com;

import akka.NotUsed;
import com.guzinski.helloworld.HelloWorldService;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.concurrent.CompletableFuture;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public ServiceCall<NotUsed, String> helloWorld() {
        return notUsed -> CompletableFuture.completedFuture("Hello World!");
    }
}
