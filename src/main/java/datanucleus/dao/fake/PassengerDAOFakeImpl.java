package datanucleus.dao.fake;

import datanucleus.dao.Passenger;
import datanucleus.dao.PassengerDAO;

public class PassengerDAOFakeImpl implements PassengerDAO {

	@Override
	public void addPassenger(Passenger passenger) {
		System.out.println("addPassenger");
	}
	
	@Override
	public Passenger getPassenger(String id){
		System.out.println("getPassenger");
		return null;
	}

}
