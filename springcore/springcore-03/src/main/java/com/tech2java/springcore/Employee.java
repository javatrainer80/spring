package com.tech2java.springcore;

/**
 * @author tech2java
 * Setter & Constructor Injection 
 * String Bean Referencing
 *
 */
public class Employee {
	
	private Integer empNo;
	private String empName;
	private Integer empAge;
	
	private Address address;
	
	//Constructor Injection
	public Employee(Integer empNo, 
			        String empName, 
			        Integer empAge,
			        Address address
			        ) {
		System.out.println("Inside Employee constructor>>"+empNo+"::"+empName+"::"+empAge+"::"+address);
		this.empNo = empNo;
		this.empName = empName;
		this.empAge = empAge;
		this.address=address;
	}

	
	//Setter Injection
	/*
	public void setEmpNo(Integer empNo) {
		System.out.println("Inside setEmpNo::"+empNo);
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		System.out.println("Inside setEmpName::"+empName);
		this.empName = empName;
	}
	public void setEmpAge(Integer empAge) {
		System.out.println("Inside setEmpAge::"+empAge);
		this.empAge = empAge;
	}
	*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empNo=").append(empNo).append(", empName=").append(empName).append(", empAge=")
				.append(empAge).append(", address=").append(address).append("]");
		return builder.toString();
	}

}
