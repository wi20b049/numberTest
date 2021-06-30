package at.Labuda;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/api")
public class RandomNumber {

    @GET
    @Path("/Numbers")
    @Produces(MediaType.TEXT_PLAIN)
    public String randomNumber(){
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        return String.format("%d",int_random);
    }
}
