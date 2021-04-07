package datanucleus.dao.fake;

import java.util.List;

import datanucleus.dao.Booking;
import datanucleus.dao.PassengerDAO;

public class PassengerDAOFakeImpl implements PassengerDAO {

	@Override
	public Booking newBooking(int id, int fid) {
		System.out.println("newbooking");
		return null;
	}
	
	public List<Booking> getBookings(int id){
		System.out.println("getbookings");
		return null;
	}

}
