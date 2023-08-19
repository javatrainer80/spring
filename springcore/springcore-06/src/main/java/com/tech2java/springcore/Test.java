package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
	
		/*
		Employee employee=applicationContext.getBean(Employee.class);
		System.out.println(employee);
		*/
		
		/*
		Message message	=applicationContext.getBean(Message.class);
		System.out.println(message);
		*/
		
		Customer customer	=applicationContext.getBean(Customer.class);
		System.out.println(customer);
		
		
		applicationContext.close();
	}

}
