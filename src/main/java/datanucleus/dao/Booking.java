package datanucleus.dao;

import java.util.UUID;

public class Booking{

    public String bid;

    public int numberOfPassengers;
    public boolean accepted;

    public Passenger passenger;
    public Flight flight;

	public Booking(int nop, Passenger passenger, Flight flight){
		this.numberOfPassengers = nop;
		this.accepted = false;
		this.passenger = passenger;
		this.flight = flight;
	} 
	
	public Booking(){
		this.bid = UUID.randomUUID().toString();
		this.numberOfPassengers = 0;
		this.accepted = false;
		this.passenger = null;
		this.flight = null;
	}
    
}