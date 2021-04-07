package jetty_jersey.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.DAO;
import datanucleus.dao.Flight;


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
	@Path("/search/{search}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> researchFlight(/*@PathParam("search")*/ String [] param) {
		return DAO.getFlightDAO().getFlights(param);
	}
	

}
