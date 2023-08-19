package com.tech2java.springcore;

public class Employee {
	
	private Address address;

	public Employee(Address address) {
		this.address=address;
		System.out.println("address2address2::"+address);
	}
	
	public void init() {
		System.out.println("Inside init method.");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method.");
	}

	@Override
	public String toString() {
		return String.format("Employee [address=%s]", address);
	}
	
}
