package com.tech2java.springaop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech2java.springaop.service.EmployeeService;

public class SpringAOPTest {
	
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService=applicationContext.getBean("empServiceProxy",EmployeeService.class);
		
		employeeService.save();
		System.out.println("==========");
		employeeService.delete();
		System.out.println("==========");
		
		employeeService.employeeException();
		
		applicationContext.close();
	}

}
