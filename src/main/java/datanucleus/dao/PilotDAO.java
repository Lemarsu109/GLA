package datanucleus.dao;

import java.util.List;

public interface PilotDAO{

    /**
     * @param id the wanted pilots's id
     * @return the list of the flights made by the passenger
     */
    List<Flight> getFlights(int id);

    /**
     * Creates a new flight
     * @param id the piot who creates the flights id
     */
    void newFlight(int id);

}