package org.acme.patterns.creational.abstractFactory.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.patterns.creational.abstractFactory.service.AnimalService;

@Path("/abstractfactory")
public class AnimalResource {
    @Inject
    AnimalService animalService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return animalService.getAnimal().getSpecies();
    }
}
