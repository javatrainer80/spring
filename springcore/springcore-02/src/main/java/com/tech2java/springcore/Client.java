package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		/**BEANFACTORY **/ //BeanDefinitionRegistry
		
		/*
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		
		Traveler traveler=beanFactory.getBean("traveler",Traveler.class);
		
		traveler.startJourney();
		*/
		
			
		
		 
		/*** APPLICATION CONTEXT*******/
		
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		//for calling close method on context
		
		
		ConfigurableApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		
		//Traveler traveler=applicationContext.getBean(Traveler.class);
		Traveler traveler=applicationContext.getBean("traveler",Traveler.class);
		
		traveler.startJourney();
		
		applicationContext.close();
		
		
	}

}
