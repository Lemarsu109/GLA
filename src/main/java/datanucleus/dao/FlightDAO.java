package datanucleus.dao;

import java.text.SimpleDateFormat;
import java.util.List;

public interface FlightDAO{

    /** 
     * @return the list of flights
     */
    List<Flight> getFlights();

    /**
     * @param date 
     * @param depairport
     * @return the list of flights with those parameters
     */
    List<Flight> getFlights(String depairport, SimpleDateFormat date);

    /**
     * @param fid the wanted flight's id 
     * @return the flight
     */
    Flight getFlight(String fid);

	/**
	 * @param flight the wanted flight
     */
    void addFlight(Flight flight);

}