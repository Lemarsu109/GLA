package datanucleus.dao;

public interface BookingDAO{

    /**
     * @param bid the wanted booking's id 
     * @return the booking
     */
    Booking getBooking(String bid);

	/**
     * @param booking the wanted booking
     */
    void addBooking(Booking booking);

}