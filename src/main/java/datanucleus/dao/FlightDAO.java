package datanucleus.dao;

import java.util.List;

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