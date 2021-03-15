package datanucleus.dao;

import datanucleus.fake.BookingDAOFakeImpl;
import datanucleus.fake.FlightDAOFakeImpl;
import datanucleus.fake.PassengerDAOFakeImpl;
import datanucleus.fake.PilotDAOFakeImpl;
import datanucleus.fake.UserDAOFakeImpl;

public class DAO {

	public static BookingDAO getBookingDAO() {
		return new BookingDAOFakeImpl();
	}
	
	public static FlightDAO getFlightDAO() {
		return new FlightDAOFakeImpl();
	}
	
	public static PassengerDAO getPassengerDAO() {
		return new PassengerDAOFakeImpl();
	}
	
	public static PilotDAO getPilotDAO() {
		return new PilotDAOFakeImpl();
	}
	
	public static UserDAO getUserDAO() {
		return new UserDAOFakeImpl();
	}
	
}