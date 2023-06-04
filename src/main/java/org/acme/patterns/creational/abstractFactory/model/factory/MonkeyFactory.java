package org.acme.patterns.creational.abstractFactory.model.factory;

import jakarta.enterprise.context.SessionScoped;
import org.acme.patterns.creational.abstractFactory.model.abstracts.AnimalFactory;
import org.acme.patterns.creational.abstractFactory.concret.Monkey;

@SessionScoped
public class MonkeyFactory implements AnimalFactory {
    @Override
    public Monkey createAnimal() {
        return new Monkey();
    }
}
