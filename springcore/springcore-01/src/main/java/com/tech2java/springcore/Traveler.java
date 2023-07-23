package com.tech2java.springcore;

public class Traveler {
	//Vehicle v=new Car();
	//Vehicle v=new Bike();
	   
	Vehicle v;
	
	//Spring Container creates Car/Bike Object and injects into Traveler by calling setter method.
	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		//v.move();
		//v.move();
	}
	
	public static void main(String[] args) {
		new Traveler().startJourney();
	}

	
	
	
}
