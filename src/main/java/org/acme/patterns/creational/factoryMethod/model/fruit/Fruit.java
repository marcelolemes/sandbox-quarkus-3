package org.acme.patterns.creational.factoryMethod.model.fruit;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public interface Fruit {
    String getName();
}
