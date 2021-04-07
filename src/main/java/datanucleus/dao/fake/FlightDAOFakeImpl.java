package datanucleus.dao.fake;

import java.util.List;

import datanucleus.dao.Flight;
import datanucleus.dao.FlightDAO;

public class FlightDAOFakeImpl implements FlightDAO {

	@Override
	public List<Flight> getFlights() {
		System.out.println("getFlights");
		return null;
	}

	@Override
	public List<Flight> getFlights(String[] parameters) {
		System.out.println("getFlights with param");
		return null;
	}

	@Override
	public Flight getFlight(int fid) {
		System.out.println("getFlight with id");
		return null;
	}

}
