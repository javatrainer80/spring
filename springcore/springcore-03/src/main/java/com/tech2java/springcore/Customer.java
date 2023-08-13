package com.tech2java.springcore;

/**
 * 
 * @author tech2java
 * Injecting values into bean properties
 *
 */
public class Customer {

	private Integer custId;
	private String custName;
	private Integer custAge;
	
	//Spring inner bean
	private Address address;
	
	
	public Customer() {
	}

	public Customer(Integer custId, String custName, Integer custAge) {
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustAge(Integer custAge) {
		this.custAge = custAge;
	}
	
	
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]" +address;
	}
	
}
