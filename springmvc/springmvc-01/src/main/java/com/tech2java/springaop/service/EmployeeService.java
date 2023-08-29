package com.tech2java.springaop.service;

public class EmployeeService {
	
	
	public void save() {
		System.out.println("Emplyee saved successfully.");
	}
	
	public void delete() {
		System.out.println("Emplyee deleted successfully.");
	}
	
	
	public void employeeException() {
		System.out.println("inside exployeeException method..");
		throw new IllegalArgumentException();
	}

}
