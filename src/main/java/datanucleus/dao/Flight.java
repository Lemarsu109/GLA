package datanucleus.dao;

import java.time.LocalDateTime;

public class Flight{

    public int id;

    public String departureAirport;
    public String arrivalAirport;
    public LocalDateTime departure;
    public int duration;
    public int numberOfPlaces;
    public String planeDescription;
    public String publicDescription;
    public String privateDescription;

    public Booking booking;
    public Pilot pilot;

}