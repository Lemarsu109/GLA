package jetty_jersey.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.User;
import datanucleus.dao.DAO;

@Path("/user")
public class UserResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{email}/{password}")
	public User getUser(@PathParam("email") String email, @PathParam("password") String password) {
		return DAO.getUserDAO().getUser(email, password);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userid}")
	public User getUser(@QueryParam("userid") String userid) {
		return DAO.getUserDAO().getUser(userid);
	}

}
