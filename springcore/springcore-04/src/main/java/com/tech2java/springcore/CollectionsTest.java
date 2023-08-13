package com.tech2java.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
		CustomerBean customerBean=applicationContext.getBean("cust",CustomerBean.class);
		System.out.println(customerBean.getAddressList());
		
		System.out.println(customerBean.getAddressSet());
				
		System.out.println(customerBean.getAddressMap());
		
		System.out.println(customerBean.getAddrProperties());
		
		
		
		//custUtil
		CustomerBean customerBean2=applicationContext.getBean("custUtil",CustomerBean.class);
		System.out.println(customerBean2.getAddressList());
		
		System.out.println(customerBean2.getAddressSet());
				
		applicationContext.close();
	}

}
