package datanucleus.dao;

import java.util.Date;

public class User{
    
    public int id;

    public String name;
    public String surname;
    public Date dateOfBirth;
    public String gender;
    public String adress;

    public int phoneNumber;
    public String email;
    public String password;
    
    public User() {
    }

	public User(int id, String name, String surname, Date dof, String gender, String adress, int phone, String email, String password){
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dof;
		this.gender = gender;
		this.adress = adress;
		this.phoneNumber = phone;
		this.email = email;
		this.password = password;
	}

}