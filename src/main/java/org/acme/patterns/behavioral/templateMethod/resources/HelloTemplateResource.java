package org.acme.patterns.behavioral.templateMethod.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.patterns.behavioral.templateMethod.model.abstracts.HelloTemplateMethod;
import org.acme.patterns.behavioral.templateMethod.model.concrete.HelloTemplateMethodChild;

@Path("/templatemethod")
public class HelloTemplateResource {


    @Path("/1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        final HelloTemplateMethod hello = new HelloTemplateMethodChild();

        return Response.ok(hello.hello()).build();
    }


}
