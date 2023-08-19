package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		/* PROPERTY PLACE HOLDER
		DatabaseConnection dbConnection=applicationContext.getBean("dbConnection",DatabaseConnection.class);
		System.out.println(dbConnection);
		*/
		
		
		//InitializingBean,DisposableBean
		EmployeeService employeeService=applicationContext.getBean("empService",EmployeeService.class);
		System.out.println(employeeService.getMessage());
		applicationContext.close();
	}

}
