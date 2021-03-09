package jetty_jersey.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.User;
import datanucleus.dao.UserDAO;
import datanucleus.dao.Booking;
import datanucleus.dao.DAO;
import datanucleus.dao.Flight;

@Path("/user/{id}")
public class UserResource {

	private final long id;

 	public UserResource(@PathParam("id") long id) {
		this.id = id;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User get() {
		//User u = getUserDAO().getUser(id);
		return new User();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public User create(User user) {
		User u = new User();
		return u;
	}
	
	@GET
	@Path("/user/passenger/{id}/booking")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Booking> bookingPassenger() {
		return new ArrayList<Booking>();
	}
	
	@GET
	@Path("/user/pilot/{id}/flight")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Booking> bookingPilot() {
		return new ArrayList<Booking>();
	}
	
	@PUT
	@Path("/user/pilot/{id}/flight")
	@Consumes(MediaType.APPLICATION_JSON)
	public Flight addFlightPilot() {
		return new Flight();
	}
	
	@PUT
	@Path("/user/passenger/{pass. id}/flight/{flight id}/booking")
	@Consumes(MediaType.APPLICATION_JSON)
	public Flight addFlightPassenger() {
		return new Flight();
	}

}
