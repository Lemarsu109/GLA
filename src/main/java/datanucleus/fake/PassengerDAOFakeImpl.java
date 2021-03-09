package datanucleus.fake;

import datanucleus.dao.PassengerDAO;

public class PassengerDAOFakeImpl implements PassengerDAO {

	@Override
	public void newBooking(int passengerId, int flightId) {
		System.out.println("newbooking");

	}

}
