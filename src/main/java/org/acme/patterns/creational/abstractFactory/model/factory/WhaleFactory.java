package org.acme.patterns.creational.abstractFactory.model.factory;

import jakarta.enterprise.context.SessionScoped;
import org.acme.patterns.creational.abstractFactory.model.abstracts.AnimalFactory;
import org.acme.patterns.creational.abstractFactory.concret.Whale;

@SessionScoped
public class WhaleFactory implements AnimalFactory {
    @Override
    public Whale createAnimal() {
        return new Whale();
    }
}
