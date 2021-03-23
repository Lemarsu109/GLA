package datanucleus.dao.dn;

import javax.jdo.PersistenceManagerFactory;

import datanucleus.dao.PassengerDAO;

public class PassengerDAOImpl implements PassengerDAO {

	private PersistenceManagerFactory pmf;

	public PassengerDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public void newBooking(int passengerId, int flightId) {
		// TODO Auto-generated method stub

	}

}
