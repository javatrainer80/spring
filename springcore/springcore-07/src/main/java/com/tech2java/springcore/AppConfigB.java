package com.tech2java.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigB {

	
	@Bean
	public Address address1() {
		
		Address address=new Address();
		address.setCity("HYD");
		address.setState("TS");
		
		return address;
	}
	
	
}
