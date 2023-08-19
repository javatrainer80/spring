package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
	
		Employee employee=applicationContext.getBean("emp1",Employee.class);
		System.out.println(employee);
		applicationContext.close();
	}

}
