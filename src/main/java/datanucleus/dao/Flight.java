package datanucleus.dao;

import java.time.LocalDateTime;
import java.util.UUID;

public class Flight{

    public String fid;

    public String departureAirport;
    public String arrivalAirport;
    public LocalDateTime departure;
    public int duration;
    public int numberOfPlaces;
    public String planeDescription;
    public String publicDescription;
    public String privateDescription;

    public Pilot pilot;

	public Flight(){
		
	}
	public Flight(String da, String aa, LocalDateTime departure, int duration, int nop,
		String planeD, String publicD, String privateD, Pilot pilot){
		this.fid = UUID.randomUUID().toString();
		this.departureAirport = da;
		this.arrivalAirport = aa;
		this.departure = departure;
		this.duration = duration;
		this.numberOfPlaces = nop;
		this.planeDescription = planeD;
		this.publicDescription = publicD;
		this.privateDescription = privateD;
		this.pilot = pilot;
	}

}