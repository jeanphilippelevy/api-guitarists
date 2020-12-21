package org.jplevy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/guitarists")
public class GuitaristsResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Guitarists";
    }

    @GET
    @Path("/list")
    @Produces(MediaType.TEXT_PLAIN)
    public String list() {
        return "List of Guitarists";
    }
}