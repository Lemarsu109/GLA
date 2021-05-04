package jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import datanucleus.dao.Passenger;
import datanucleus.dao.DAO;

@Path("/user")
public class PassengerResource {

	@PUT
	@Path("/passenger")
	public void newPassenger(String parameters) {
		String [] param = parameters.split("/");
		String [] date = param[2].split("-");
		Passenger passenger = new Passenger(param[0], param[1], 
		LocalDate.of(Integer.valueOf(date[0]), Month.of(Integer.valueOf(date[1])), 
		Integer.valueOf(date[2])), param[3], param[4], param[5], param[6], param[7]);
		DAO.getPassengerDAO().addPassenger(passenger);
	}

}
