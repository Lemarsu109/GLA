package datanucleus.dao;

import java.util.List;

public interface PassengerDAO{

    /**
     * Creates a new Booking
     * @param id the passengers who creates the booking id
     * @param fid the flight on wich the passengers wants to make the booking id
     */
    Booking newBooking(int id, int fid);
	
	List<Booking> getBookings(int id);

}