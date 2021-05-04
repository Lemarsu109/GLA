package datanucleus.dao;

import java.time.LocalDate;
import java.util.List;

public class Pilot extends User{

	public String experience;
    public String qualifications;
    public int numberOfFlightHours;

    public List<Flight> flightList;
    
    public Pilot() {
    	
    }

    public Pilot(String name, String surname, LocalDate dof, String gender, String adress, 
		String phone, String email, String password, String exp, String qual, int nofh) {
		super(name, surname, dof, gender, adress, phone, email, password);
		this.experience = exp;
		this.qualifications = qual;
		this.numberOfFlightHours = nofh;
		this.flightList = null;
	}
    
}