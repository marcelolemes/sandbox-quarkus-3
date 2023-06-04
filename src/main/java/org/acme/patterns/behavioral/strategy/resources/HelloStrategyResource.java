package org.acme.patterns.behavioral.strategy.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.patterns.behavioral.strategy.model.concrete.HelloFactory;
import org.acme.patterns.behavioral.strategy.model.abstracts.HelloStrategy;

@Path("/strategy")
public class HelloStrategyResource {
    @Inject
    HelloFactory helloFactory;

    @Path("/1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        final HelloStrategy helloStrategy =
                helloFactory.getHelloWorld();
        return helloStrategy.hello();
    }

    @Path("/2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloBuddy() {
        final HelloStrategy helloStrategy =
                helloFactory.getHelloBuddy();
        return helloStrategy.hello();
    }
    @Path("/3")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response justHello() {
        final HelloStrategy helloStrategy =
                helloFactory.getJustHello();
        return helloStrategy.hello();
    }
}
