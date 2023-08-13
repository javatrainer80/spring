package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingTest {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		Message msg=applicationContext.getBean("msg",Message.class);
		
		applicationContext.start();
		
		System.out.println(msg);
		
		applicationContext.close();
	}

}
