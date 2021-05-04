package datanucleus.dao;

import java.time.LocalDate;
import java.util.List;

public class Passenger extends User{

	public List<Booking> listOfBookings;
	
	public Passenger() {
		
	}
	
	public Passenger(String name, String surname, LocalDate dob, String gender, String adress, 
		String phone, String email, String password) {
		super(name, surname, dob, gender, adress, phone, email, password);
		this.listOfBookings = null;
	}
	
}