package org.acme.patterns.creational.abstractFactory.model;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public class WhaleFactory implements AnimalFactory {
    @Override
    public Whale createAnimal() {
        return new Whale();
    }
}
