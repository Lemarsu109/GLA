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
		User u = new User();
		u.email = "buruhdde";
		u.id = "mabite";
		return u;
		//return DAO.getUserDAO().getUser(email, password);
		// à voir ce que le serv renvoie si l'utilisateur n'est pas trouvé
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@QueryParam("userid") String userid) {
		User u = new User();
		u.email = "buruhdde";
		u.id = "mabite";
		return u;
		//return DAO.getUserDAO().getUser(userid);
		// à voir ce que le serv renvoie si l'utilisateur n'est pas trouvé
	}

}
