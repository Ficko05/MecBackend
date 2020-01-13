
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.User;
import facade.UserMapper;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

@Path("createlogin")
public class LoginResource {
    
    
    
    @Context
    private UriInfo context;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    private final UserMapper userMapper;

    @Context
    SecurityContext securityContext;
    
    
    public LoginResource() {

        
        userMapper = new UserMapper(emf);
    }
    
    @POST
    @Path("createUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(String json) throws Exception {
        User user = gson.fromJson(json, User.class);
       
        user.hashPassword();
        
        User returnedUser = userMapper.create(user);
        //UserDTO userDTO = UserDTO.getUserDTO(returnedUser);


      return Response.status(Response.Status.CREATED).entity(returnedUser).build();

    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        String json = gson.toJson(userMapper.getAllUsers());
        
        return Response.ok(json).build();
    }
    
    
}
