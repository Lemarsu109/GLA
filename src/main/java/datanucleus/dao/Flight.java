package datanucleus.dao;

import java.time.LocalDateTime;

public class Flight{

    public int fid;

    public String departureAirport;
    public String arrivalAirport;
    public LocalDateTime departure;
    public int duration;
    public int numberOfPlaces;
    public String planeDescription;
    public String publicDescription;
    public String privateDescription;

    public Pilot pilot;

}