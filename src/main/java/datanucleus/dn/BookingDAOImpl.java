package datanucleus.dn;


import javax.jdo.PersistenceManagerFactory;

import datanucleus.dao.Booking;
import datanucleus.dao.BookingDAO;

public class BookingDAOImpl implements BookingDAO {
	
	private PersistenceManagerFactory pmf;

	public BookingDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public Booking getBooking(int id) {
		
		return null;
	}

}
