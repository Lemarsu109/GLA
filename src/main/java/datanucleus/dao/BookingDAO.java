package datanucleus.dao;

public interface BookingDAO{

	Booking getBooking(int bid);

    /**
     * @param bid the wanted booking's id 
     * @return the booking
     */
    //Booking getBooking(int id);

}