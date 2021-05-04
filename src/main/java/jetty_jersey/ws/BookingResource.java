package jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.Booking;
import datanucleus.dao.DAO;
import datanucleus.dao.Passenger;

@Path("/booking")
public class BookingResource {
	
	@PUT
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	public void newBooking(String parameters) {
		String [] param = parameters.split("/");
		Booking booking = new Booking(Integer.valueOf(param[0]),
		(Passenger)DAO.getUserDAO().getUser(param[1]), DAO.getFlightDAO().getFlight(param[2]));
		DAO.getBookingDAO().addBooking(booking);
	}
	
}
