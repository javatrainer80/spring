package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIClient {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
		
		Employee employee=applicationContext.getBean("emp",Employee.class);
		System.out.println(employee);
		
		applicationContext.close();
	}

}
