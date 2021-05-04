package jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import datanucleus.dao.Pilot;
import datanucleus.dao.DAO;

@Path("/user")
public class PilotResource {

	@PUT
	@Path("/pilot")
	public void newPilot(String parameters) {
		String [] param = parameters.split("/");
		String [] date = param[2].split("-");
		Pilot pilot = new Pilot(param[0], param[1], 
		LocalDate.of(Integer.valueOf(date[0]), Month.of(Integer.valueOf(date[1])), 
		Integer.valueOf(date[2])), param[3], param[4], param[5], param[6], param[7], param[8],
		param[9], Integer.valueOf(param[10]));
		DAO.getPilotDAO().addPilot(pilot);
	}
}
