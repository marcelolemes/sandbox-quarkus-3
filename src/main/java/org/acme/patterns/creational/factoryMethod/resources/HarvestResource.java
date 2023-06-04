package org.acme.patterns.creational.factoryMethod.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.patterns.creational.factoryMethod.services.HarvestService;

@Path("/factory")
public class HarvestResource {
    @Inject
    HarvestService harvestService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return harvestService.harvest();
    }
}
