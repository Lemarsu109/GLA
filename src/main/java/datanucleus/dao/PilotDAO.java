package datanucleus.dao;

public interface PilotDAO{

    /**
     * Creates a new pilot
     * @param pilot the pilot to add
     */
    void addPilot(Pilot pilot);

	/**
     * @param id the passenger's id
     * @return the passenger with the wanted id
     */
	Pilot getPilot(String id);

}