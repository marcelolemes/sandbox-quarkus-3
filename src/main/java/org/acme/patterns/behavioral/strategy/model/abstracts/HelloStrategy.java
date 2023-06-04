package org.acme.patterns.behavioral.strategy.model.abstracts;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

public interface HelloStrategy {
    default Response hello(){
        return Response.ok("Just Hello!").build();
    }
}
