# Lagom Hello World Example

Lagom is a powerful framework to build reactive microservices.
This repository is an exercise of the **Lagom hello World** course from the lightbend academy.
ANd show how to create a hello world project with lagom and consume it from an external client. 

### Project Structure

`hello-world-api` contains the Api Contract for this service, should be shared with the client who will use this service.

`hello-world-client` a java main method to call the microservice as an external client.

`hello-world-impl` the implementation of the service api, cannot be shared with externals clients. This implemention also includes an example of unit and integration tests.


### To run

    mvn lagom:runAll
    
It should start the http service running at port 9000. After that you can run the Main class in the `hello-world-client` to test the microservice. Or just point to the browser http://localhost:9000/hello-world