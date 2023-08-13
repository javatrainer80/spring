package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans2.xml");
		
		Customer customer=applicationContext.getBean("customer",Customer.class);
		System.out.println(customer);
		
		applicationContext.close();
		
		
		//Spring Inner Bean
        ConfigurableApplicationContext applicationContext1=new ClassPathXmlApplicationContext("beans3.xml");
		
		Customer cust=applicationContext1.getBean("customer",Customer.class);
		System.out.println(cust);
		
		applicationContext1.close();
		
		
		
	}

}
