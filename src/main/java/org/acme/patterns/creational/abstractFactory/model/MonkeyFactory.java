package org.acme.patterns.creational.abstractFactory.model;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public class MonkeyFactory implements AnimalFactory{
    @Override
    public Monkey createAnimal() {
        return new Monkey();
    }
}
