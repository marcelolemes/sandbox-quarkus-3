package org.acme.patterns.creational.factoryMethod.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.patterns.creational.factoryMethod.model.concrete.Apple;
import org.acme.patterns.creational.factoryMethod.model.concrete.Banana;
import org.acme.patterns.creational.factoryMethod.model.abstracts.Fruit;
import org.acme.patterns.creational.factoryMethod.model.abstracts.Harvest;

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
