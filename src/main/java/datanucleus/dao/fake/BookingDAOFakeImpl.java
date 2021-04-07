package datanucleus.dao.fake;

import datanucleus.dao.Booking;
import datanucleus.dao.BookingDAO;

public class BookingDAOFakeImpl implements BookingDAO {

	@Override
	public Booking getBooking(int id) {
		Booking booking = new Booking();
		booking.bid=4;
		System.out.println("getbooking");
		return booking;
	}

}
