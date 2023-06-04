package org.acme.patterns.creational.factoryMethod.model.concrete;

import jakarta.enterprise.context.RequestScoped;
import org.acme.patterns.creational.factoryMethod.model.abstracts.Fruit;
import org.acme.patterns.creational.factoryMethod.model.abstracts.Harvest;

@RequestScoped
public class HarvestImpl implements Harvest {
    @Override
    public String harvest(Fruit fruit) {
        return ("Fruta "+fruit.getName()+" colhida!");

    }
}
