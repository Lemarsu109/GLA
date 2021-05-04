package datanucleus.dao.dn;

import javax.jdo.PersistenceManagerFactory;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import datanucleus.dao.Passenger;
import datanucleus.dao.PassengerDAO;

public class PassengerDAOImpl implements PassengerDAO {

	private PersistenceManagerFactory pmf;

	public PassengerDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public void addPassenger(Passenger passenger) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(passenger);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

	}
	
	@Override
	public Passenger getPassenger(String id) {
		Passenger passenger = null;
		Passenger detached = new Passenger();
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(Passenger.class);
			q.declareParameters("String id");
			q.setFilter("id == passenger.id");

			passenger = (Passenger) q.execute(id);
			detached = (Passenger) pm.detachCopy(passenger);

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
