
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facade.MachineInfoMapper;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Ficko
 */
@Path("m7")
public class GenericResource {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
     Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    /**Gson gson;**/
    MachineInfoMapper fp = new MachineInfoMapper(Persistence.createEntityManagerFactory("pu"));
    
    public GenericResource() {
    }

    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        String json = gson.toJson(fp.getAll());
        
        return Response.ok(json).build();
    }

    
}
