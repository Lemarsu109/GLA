package datanucleus.dao.fake;

import java.text.SimpleDateFormat;
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
	public List<Flight> getFlights(String depairport, SimpleDateFormat date) {
		System.out.println("getFlights with param" + depairport + date);
		return null;
	}

	@Override
	public Flight getFlight(String fid) {
		System.out.println("getFlight with fid");
		return null;
	}
	
	@Override
	public void addFlight(Flight flight){
		
	}

}
