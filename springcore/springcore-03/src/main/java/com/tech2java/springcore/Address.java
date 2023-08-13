package com.tech2java.springcore;

public class Address {
	
	private String city;
	private String state;
	
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [city=").append(city).append(", state=").append(state).append("]");
		return builder.toString();
	}
	
	

}
