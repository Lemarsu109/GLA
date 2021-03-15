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

@Path("/user")
public class UserResource {

	private final long id;

 	public UserResource(@PathParam("id") long id) {
		this.id = id;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public User get() {
		//User u = getUserDAO().getUser(id);
		return new User();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public User create() {
		User u = new User();
		return u;
	}
	
	@GET
	@Path("/{id}/passenger/booking")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Booking> listBookingPassenger() {
		return new ArrayList<Booking>();
	}
	
	@GET
	@Path("/{id}/pilot/flight")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> listFlightPilot() {
		return new ArrayList<Flight>();
	}
	
	@PUT
	@Path("/{id}/pilot/{fid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Flight addFlightPilot() {
		return new Flight();
	}
	
	@PUT
	@Path("/{id}/passenger/{fid}/booking")
	@Consumes(MediaType.APPLICATION_JSON)
	public Booking bookingPassenger() {
		return new Booking();
	}

}
