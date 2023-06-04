package org.acme.patterns.creational.factoryMethod.model.abstracts;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public interface Fruit {
    String getName();
}
