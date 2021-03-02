package datanucleus.dao;

import java.util.List;

public class Pilot extends User{

    public String experience;
    public String qualifications;
    public int numberOfFlightHours;

    public List<Flight> flightList;

}