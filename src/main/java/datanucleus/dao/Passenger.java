package datanucleus.dao;

import java.util.Date;
import java.util.List;

public class Passenger extends User{

    

	public List<Booking> listOfBookings;
	
	public Passenger() {
		
	}
	
	public Passenger(int id, String name, String surname, Date dof, String gender, String adress, int phone, String email,
			String password) {
		super(id, name, surname, dof, gender, adress, phone, email, password);
		// TODO Auto-generated constructor stub
	}
	
}