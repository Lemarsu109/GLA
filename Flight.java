public class Flight{

    public int id;

    public String departureAirport;
    public String arrivalAirport;
    public DateTime departure;
    public int duration;
    public int numberOfPlaces;
    public String planeDescription;
    public String publicDescription;
    public String privateDescription;

    public Booking booking;
    public Pilot pilot;

}

public interface FlightDAO{

    /**
     * @return the list of flights
     */
    List<Flight> getFlights();

    /**
     * @param parameters the research parameters
     * @return the list of flights with those parameters
     */
    List<Flight> getFlights(String[] parameters);

    /**
     * @param id the wanted flight's id 
     * @return the flight
     */
    Flight getFlight(int id);

}