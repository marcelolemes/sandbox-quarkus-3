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
        final StringBuilder harvestReturn = new StringBuilder();

        harvestReturn.append(harvest.harvest(banana));
        harvestReturn.append(" ");
        harvestReturn.append(harvest.harvest(apple));

        return harvestReturn.toString();

    }
}
