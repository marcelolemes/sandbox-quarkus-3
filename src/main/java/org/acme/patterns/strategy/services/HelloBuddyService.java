package org.acme.patterns.strategy.services;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.core.Response;
import org.acme.patterns.strategy.model.HelloStrategy;

@RequestScoped
public class HelloBuddyService
        implements HelloStrategy {
    @Override
    public Response hello() {
        return Response.ok("Hello Buddy!").build();
    }
}
