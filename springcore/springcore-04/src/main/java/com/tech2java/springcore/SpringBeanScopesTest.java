package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopesTest {
	
	public static void main(String[] args) {
		
		/*
		//case 1(scope="singleton" lazy-init="default")
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		ProductService productService=applicationContext.getBean("prodService",ProductService.class);
		
		productService.setProductDescription("Samsung Galaxy Z Flip5 5G (Lavender, 8GB RAM, 256GB Storage)");
		System.out.println(productService);
		
		ProductService productService1=applicationContext.getBean("prodService",ProductService.class);
		System.out.println(productService1);
		
		applicationContext.close();
		*/
		
		
		/*
		//case 2(scope="singleton" lazy-init="true")
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("Before getBean() method..");
		ProductService productService=applicationContext.getBean("prodService",ProductService.class);
		System.out.println("After getBean() method..");
		
		applicationContext.close();
		*/
		
		//case 3(scope="prototype")
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		ProductService productService=applicationContext.getBean("prodService",ProductService.class);
		
		productService.setProductDescription("Samsung Galaxy Z Flip5 5G (Lavender, 8GB RAM, 256GB Storage)");
		System.out.println(productService);
		
		ProductService productService1=applicationContext.getBean("prodService",ProductService.class);
		System.out.println(productService1);
		
		applicationContext.close();
	}

}
