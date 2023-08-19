package com.tech2java.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigA {

	
	@Bean(initMethod = "init",destroyMethod = "destroy")
	public Employee emp1() {
		
		return new Employee(address1());
	}
	
	
	@Bean
	public Address address1() {
		
		Address address=new Address();
		address.setCity("HYD");
		address.setState("TS");
		
		return address;
	}
	
	
}
