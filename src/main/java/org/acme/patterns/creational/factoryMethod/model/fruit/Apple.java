package org.acme.patterns.creational.factoryMethod.model.fruit;

public class Apple implements Fruit{
    private String name;

    public String getName() {
        return this.name;
    }

    public Apple(String name) {
        this.name = name;
    }
    public Apple() {
        this.name = "Apple";
    }
}
