package com.tech2java.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	private Integer empId;
	private String empName;

	//2
	/*
	@Autowired(required = false)*/
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	//3
	
	/*@Autowired
	public Employee(Address address) {
		this.address = address;
	}
	*/

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	//1
	/*
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	*/
	
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, address=%s]", empId, empName, address);
	}
	
	
}
