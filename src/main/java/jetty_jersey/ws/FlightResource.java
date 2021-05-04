package jetty_jersey.ws;

import java.time.LocalDateTime;
import java.time.Month;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.DAO;
import datanucleus.dao.Flight;
import datanucleus.dao.Pilot;


@Path("/flight")
public class FlightResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{fid}")
	public Flight getFlight(@PathParam("fid") String fid) {
		return DAO.getFlightDAO().getFlight(fid);
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getAll() {
		return DAO.getFlightDAO().getFlights();
	}
	
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> researchFlight(@QueryParam("depairport") String depairport, 
		@QueryParam("depdate") SimpleDateFormat date) {
		return DAO.getFlightDAO().getFlights(depairport,date);
	}
	
	@PUT
	@Path("/new")
	public void newFlight(String parameters) {
		String [] param = parameters.split("/");
		String [] date = param[2].split("-");
		String [] time = param[3].split(":");
		Flight flight = new Flight(param[0], param[1], 
		LocalDateTime.of(Integer.valueOf(date[0]), Month.of(Integer.valueOf(date[1])), 
		Integer.valueOf(date[2]), Integer.valueOf(time[0]), Integer.valueOf(time[1])),
		Integer.valueOf(param[4]), Integer.valueOf(param[5]), 
		param[6], param[7], param[8], (Pilot)DAO.getUserDAO().getUser(param[9]));
		DAO.getFlightDAO().addFlight(flight);
	}

}
