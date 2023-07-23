package com.tech2java.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Traveler implements InitializingBean,DisposableBean{
	//Vehicle v=new Car();
	//Vehicle v=new Bike();
	   
	Vehicle vehicle;
	
	public Traveler() {
	 System.out.println("Traveler Object is creating..");
	}
	
	//Spring Container creates Car/Bike Object and injects into Traveler by calling setter method.
	public void setVehicle(Vehicle vehicle) {
		System.out.println("Setting "+vehicle.getClass() +" to Traveler Vachile reference");
		this.vehicle = vehicle;
	}

	public void startJourney() {
		//v.move();
		vehicle.move();
	}
	
	public static void main(String[] args) {
		new Traveler().startJourney();
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method");
		
	}

	
	
	
}
