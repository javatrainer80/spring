package com.tech2java.springcore;

public class EmployeeService /*implements InitializingBean,DisposableBean*/ {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Inside setMessage() method..");
		this.message = message;
	}

	/*
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Inside afterPropertiesSet method..");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method..");
		
	}
	*/

	
	public void init() throws Exception {
		
		System.out.println("Inside init method..");
		
	}

	
	public void destroy() throws Exception {
		System.out.println("Inside destroy method..");
		
	}
	
	
	
	
}
