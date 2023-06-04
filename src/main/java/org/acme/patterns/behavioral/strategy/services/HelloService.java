package org.acme.patterns.behavioral.strategy.services;

import jakarta.enterprise.context.RequestScoped;
import org.acme.patterns.behavioral.strategy.model.HelloStrategy;

@RequestScoped
public class HelloService
        implements HelloStrategy {

}
