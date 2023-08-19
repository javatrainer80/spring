package com.tech2java.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import({AppConfigA.class,AppConfigB.class})
public class AppConfig {

	@Bean
	public Employee emp() {
		
		return new Employee(address());
		}
	
	
	@Bean
	@Scope("singleton")
	public Address address() {
		
		Address address=new Address();
		address.setCity("HYD");
		address.setState("TS");
		
		return address;
	}
	
	
}
