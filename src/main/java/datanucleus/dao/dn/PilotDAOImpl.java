package datanucleus.dao.dn;

import java.util.List;

import javax.jdo.PersistenceManagerFactory;

import datanucleus.dao.Flight;
import datanucleus.dao.PilotDAO;

public class PilotDAOImpl implements PilotDAO {

	private PersistenceManagerFactory pmf;

	public PilotDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public List<Flight> getFlights(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight newFlight(int id) {
		return null;
		// TODO Auto-generated method stub

	}

}
