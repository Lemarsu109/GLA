package datanucleus.dao.dn;


import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import datanucleus.dao.Booking;
import datanucleus.dao.BookingDAO;

public class BookingDAOImpl implements BookingDAO {
	
	private PersistenceManagerFactory pmf;

	public BookingDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public Booking getBooking(int bid) {
		Booking booking = null;
		Booking detached = new Booking();
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(Booking.class);
			q.declareParameters("int bid");
			q.setFilter("bid == booking.bid");

			booking = (Booking) q.execute(bid);
			detached = (Booking) pm.detachCopy(booking);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

}
