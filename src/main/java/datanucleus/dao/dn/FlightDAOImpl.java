package datanucleus.dao.dn;

import java.util.List;

import javax.jdo.PersistenceManagerFactory;

import datanucleus.dao.Flight;
import datanucleus.dao.FlightDAO;

public class FlightDAOImpl implements FlightDAO {
	
	private PersistenceManagerFactory pmf;

	public FlightDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public List<Flight> getFlights() {
		return null;
	}

	@Override
	public List<Flight> getFlights(String[] parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlight(int id) {
		return null;
	}

}
