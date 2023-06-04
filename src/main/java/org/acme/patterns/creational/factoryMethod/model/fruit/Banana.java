package org.acme.patterns.creational.factoryMethod.model.fruit;

public class Banana implements Fruit{
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
