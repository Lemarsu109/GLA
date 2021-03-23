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

import datanucleus.dao.FlightContainer;

@Path("/flight")
public class FlightResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{fid}")
	public Flight get(@PathParam("fid") int fid) {
		return DAO.getFlightDAO().getFlight(fid);
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getAll() {
		return DAO.getFlightDAO().getFlights();
	}
	
	@GET
	@Path("/{search}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> researchFlight() {
		return new ArrayList<Flight>();
	}
	

}
