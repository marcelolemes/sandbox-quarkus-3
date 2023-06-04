package org.acme.patterns.creational.abstractFactory.concret;

import org.acme.patterns.creational.abstractFactory.model.abstracts.Animal;

public class Monkey extends Animal {
    boolean hasTail;

    public Monkey() {
        this.species = "Monkey";
    }
}
