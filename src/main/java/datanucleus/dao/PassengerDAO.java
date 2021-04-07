package datanucleus.dao;

import java.util.List;

public interface PassengerDAO{

    /**
     * Creates a new Booking
     * @param fid the flight on wich the passengers wants to make the booking id
     */
    Booking newBooking(Booking booking);
	
	List<Booking> getBookings(int id);

}