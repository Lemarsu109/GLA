package datanucleus.dao;

import java.util.Date;
import java.util.List;

public class Pilot extends User{

	public String experience;
    public String qualifications;
    public int numberOfFlightHours;

    public List<Flight> flightList;
    
    public Pilot() {
    	
    }

    public Pilot(int id, String name, String surname, Date dof, String gender, String adress, int phone, String email,
			String password) {
		super(id, name, surname, dof, gender, adress, phone, email, password);
		// TODO Auto-generated constructor stub
	}
    
}