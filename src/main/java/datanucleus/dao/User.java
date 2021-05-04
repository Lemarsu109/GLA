package datanucleus.dao;

import java.time.LocalDate;
import java.util.UUID;

public class User{
    
    public String id;

    public String name;
    public String surname;
    public LocalDate dateOfBirth;
    public String gender;
    public String adress;

    public String phoneNumber;
    public String email;
    public String password;
    
    public User() {
    }

	public User(String name, String surname, LocalDate dob, String gender, String adress, String phone, 
		String email, String password){
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dob;
		this.gender = gender;
		this.adress = adress;
		this.phoneNumber = phone;
		this.email = email;
		this.password = password;
	}

}