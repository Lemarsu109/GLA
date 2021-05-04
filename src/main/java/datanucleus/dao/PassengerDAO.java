package datanucleus.dao;

public interface PassengerDAO{

    /**
     * Creates a new Passenger
     * @param passenger the passenger to add
     */
    void addPassenger(Passenger passenger);

	/**
     * @param id the passenger's id
     * @return the passenger with the wanted id
     */
	Passenger getPassenger(String id);
	
}