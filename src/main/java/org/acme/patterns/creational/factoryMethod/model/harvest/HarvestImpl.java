package org.acme.patterns.creational.factoryMethod.model.harvest;

import jakarta.enterprise.context.RequestScoped;
import org.acme.patterns.creational.factoryMethod.model.fruit.Fruit;

@RequestScoped
public class HarvestImpl implements Harvest{
    @Override
    public String harvest(Fruit fruit) {
        return ("Fruta "+fruit.getName()+" colhida!");

    }
}
