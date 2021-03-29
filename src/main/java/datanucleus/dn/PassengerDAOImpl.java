package datanucleus.dn;

import javax.jdo.PersistenceManagerFactory;

import datanucleus.dao.Booking;
import java.util.List;
import datanucleus.dao.PassengerDAO;

public class PassengerDAOImpl implements PassengerDAO {

	private PersistenceManagerFactory pmf;

	public PassengerDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public Booking newBooking(int passengerId, int flightId) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public List<Booking> getBookings(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
