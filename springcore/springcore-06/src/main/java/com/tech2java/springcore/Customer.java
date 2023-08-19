package com.tech2java.springcore;

import jakarta.annotation.Resource;

public class Customer {
	
	@Resource
	private Address address1;

	@Override
	public String toString() {
		return String.format("Customer [address1=%s]", address1);
	}

	
	
}
