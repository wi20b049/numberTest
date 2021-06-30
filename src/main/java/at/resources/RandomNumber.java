package at.resources;

import javax.ws.rs.*;
import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.*;
import java.util.Random;

@Path("/api")
public class RandomNumber {

    @GET
    @Path("/Numbers")
    @Produces(MediaType.TEXT_PLAIN)
    public int randomNumber(){
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        return (int_random);

    }



}

