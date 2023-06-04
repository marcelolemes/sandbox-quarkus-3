package org.acme.patterns.creational.factoryMethod.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.patterns.creational.factoryMethod.model.fruit.Apple;
import org.acme.patterns.creational.factoryMethod.model.fruit.Banana;
import org.acme.patterns.creational.factoryMethod.model.fruit.Fruit;
import org.acme.patterns.creational.factoryMethod.model.harvest.Harvest;

@ApplicationScoped
public class HarvestService {

    @Inject
    Harvest harvest;

    public String harvest() {
        final Fruit banana = new Banana();
        final Fruit apple = new Apple();

        final String harvest1 = harvest.harvest(banana);
        final String harvest2 = harvest.harvest(apple);
        final String harvestTotal = harvest1.concat(" " + harvest2);

        return harvestTotal;

    }
}
