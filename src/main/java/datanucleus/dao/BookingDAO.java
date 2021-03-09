package datanucleus.dao;

public interface BookingDAO{

    /**
     * @param id the wanted booking's id 
     * @return the booking
     */
    Booking getBooking(int id);

}