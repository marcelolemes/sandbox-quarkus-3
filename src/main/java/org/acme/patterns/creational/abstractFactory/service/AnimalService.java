package org.acme.patterns.creational.abstractFactory.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.patterns.creational.abstractFactory.model.abstracts.Animal;
import org.acme.patterns.creational.abstractFactory.model.abstracts.AnimalFactory;
import org.acme.patterns.creational.abstractFactory.model.factory.MonkeyFactory;
import org.acme.patterns.creational.abstractFactory.model.factory.WhaleFactory;

import java.util.Random;
@ApplicationScoped
public class AnimalService {
    public Animal animal;
    private int random;

    private AnimalFactory animalFactory;

    public Animal getAnimal() {
        Random randomic = new Random();
        this.random = randomic.ints().findFirst().getAsInt();
        if (random % 2 == 0) {
            animalFactory = new MonkeyFactory();
        } else {
            animalFactory = new WhaleFactory();
        }
        this.animal = animalFactory.createAnimal();
        return animal;
    }
}
