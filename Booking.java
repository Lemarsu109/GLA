public class Booking{

    public int id;

    public int numberOfPassengers;
    public boolean accepted;

    public PassengerUser passenger;
    public Flight flight;

}

public interface BookingDAO{

    /**
     * @param id the wanted booking's id 
     * @return the booking
     */
    Booking getBooking(int id);

}