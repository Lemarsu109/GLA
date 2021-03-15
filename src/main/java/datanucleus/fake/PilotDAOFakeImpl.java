package datanucleus.fake;

import java.util.List;

import datanucleus.dao.Flight;
import datanucleus.dao.PilotDAO;

public class PilotDAOFakeImpl implements PilotDAO {

	@Override
	public List<Flight> getFlights(int id) {
		System.out.println("getFlights for a pilot");
		return null;
	}

	@Override
	public void newFlight(int id) {
		System.out.println("new flight for a pilot");

	}

}
