package datanucleus.dao;

import datanucleus.dao.fake.BookingDAOFakeImpl;
import datanucleus.dao.fake.FlightDAOFakeImpl;
import datanucleus.dao.fake.PassengerDAOFakeImpl;
import datanucleus.dao.fake.PilotDAOFakeImpl;
import datanucleus.dao.fake.UserDAOFakeImpl;

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