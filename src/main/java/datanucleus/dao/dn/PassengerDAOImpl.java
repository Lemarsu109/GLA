package datanucleus.dao.dn;

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
	public Booking newBooking(Booking booking) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(action);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}	}

	@Override
	public List<Booking> getBookings(int id) {
		return null;
	}

}
