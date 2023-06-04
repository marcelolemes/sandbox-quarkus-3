package org.acme.patterns.creational.factoryMethod.model.concrete;

import org.acme.patterns.creational.factoryMethod.model.abstracts.Fruit;

public class Banana implements Fruit {
    private String name;

    public String getName() {
        return this.name;
    }

    public Banana(String name) {
        this.name = name;
    }
    public Banana() {
        this.name = "Banana";
    }
}
