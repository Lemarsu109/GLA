package jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datanucleus.dao.Booking;
import datanucleus.dao.DAO;
import datanucleus.dao.Flight;
import datanucleus.dao.Passenger;

@Path("/booking")
public class BookingResource {
	
	/*@GET
	@Path("/{bid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Booking getBooking(@PathParam("bid") int bid) {
		Booking booking = new Booking();
		return booking;
		//return DAO.getPassengerDAO().getBookings(bid);
	}*/
	
	
	@PUT
	@Path("/{nop}/{id}/{fid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void newBooking(String parameters) {
		String [] param = parameters.split("/");
		Booking booking = new Booking(Integer.valueOf(param[0]),
		(Passenger)DAO.getUserDAO().getUser(param[1]), DAO.getFlightDAO().getFlight(param[2]));
		DAO.getBookingDAO().addBooking(booking);
	}
	

}
