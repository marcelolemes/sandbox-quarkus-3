package org.acme.patterns.behavioral.strategy.services;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.core.Response;
import org.acme.patterns.behavioral.strategy.model.abstracts.HelloStrategy;

@RequestScoped
public class HelloWorldService
        implements HelloStrategy {
    @Override
    public Response hello() {
        return Response.ok("Hello World!").build();
    }
}
