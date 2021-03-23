package datanucleus.dao;

public interface PassengerDAO{

    /**
     * Creates a new Booking
     * @param passengerId the passengers who creates the booking id
     * @param flightid the flight on wich the passengers wants to make the booking id
     */
    void newBooking(int passengerId, int flightId);

}