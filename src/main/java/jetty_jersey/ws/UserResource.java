package jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.User;
import datanucleus.dao.Booking;
import datanucleus.dao.DAO;
import datanucleus.dao.Flight;

@Path("/user")
public class UserResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public User get(@PathParam("id") int id) {
		return DAO.getUserDAO().getUser(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public User newUser(boolean pilot) {
		return DAO.getUserDAO().newUser(pilot);
	}
	
	@GET
	@Path("/{id}/passenger/booking")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Booking> getBookings(@PathParam("id") int id) {
		return DAO.getPassengerDAO().getBookings(id);
	}
	
	@GET
	@Path("/{id}/pilot/flight")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlights(@PathParam("id") int id) {
		return DAO.getPilotDAO().getFlights(id);
	}
	
	@PUT
	@Path("/{id}/pilot/{fid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Flight addFlightPilot(@PathParam("id") int id, @PathParam("fid") int fid) {
		return DAO.getPilotDAO().newFlight(id);
	}
	
	@PUT
	@Path("/{id}/passenger/{fid}/booking")
	@Consumes(MediaType.APPLICATION_JSON)
	public Booking newBooking(@PathParam("id") int id, @PathParam("fid") int fid) {
		return DAO.getPassengerDAO().newBooking(booking);
	}

}
