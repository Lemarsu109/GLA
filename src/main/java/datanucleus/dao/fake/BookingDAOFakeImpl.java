package datanucleus.dao.fake;

import datanucleus.dao.Booking;
import datanucleus.dao.BookingDAO;

public class BookingDAOFakeImpl implements BookingDAO {
	
	@Override
	public void addBooking(Booking booking){
		System.out.println("addBooking");
	}
	
	@Override
	public Booking getBooking(String bid) {
		System.out.println("getBooking");
		return null;
	}

}
