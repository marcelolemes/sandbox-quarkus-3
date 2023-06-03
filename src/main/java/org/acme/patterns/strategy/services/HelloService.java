package org.acme.patterns.strategy.services;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.core.Response;
import org.acme.patterns.strategy.model.HelloStrategy;

@RequestScoped
public class HelloService
        implements HelloStrategy {

}
