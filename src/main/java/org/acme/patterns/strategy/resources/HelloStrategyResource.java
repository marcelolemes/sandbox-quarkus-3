package org.acme.patterns.strategy.resources;

import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.patterns.strategy.model.HelloFactory;
import org.acme.patterns.strategy.model.HelloStrategy;
import org.acme.patterns.strategy.services.HelloBuddyService;
import org.acme.patterns.strategy.services.HelloService;
import org.acme.patterns.strategy.services.HelloWorldService;

@Path("/strategy")
public class HelloStrategyResource {

    private HelloStrategy helloStrategy;
    @Inject
    private HelloFactory helloFactory;

    @Path("/1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        helloStrategy = helloFactory.getHelloWorld();
        return helloStrategy.hello();
    }

    @Path("/2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloBuddy() {
        helloStrategy = helloFactory.getHelloBuddy();
        return helloStrategy.hello();
    }
    @Path("/3")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response justHello() {
        helloStrategy = helloFactory.getJustHello();
        return helloStrategy.hello();
    }
}
