package com.tech2java.springjdbc;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech2java.springjdbc.dto.Product;

public class SpringJDBCTest {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		ProductDao productDao=applicationContext.getBean("productDao",ProductDaoImpl.class);
		
		//Prepare Product Object
		Product product=new Product();
		product.setProductId(1000);
		product.setProductName("SAMSUNG Galaxy A24 ");
		product.setProductDesc("SAMSUNG Galaxy A24 (SM-A245M/DS) Dual SIM,128GB + 4GB, Factory Unlocked GSM, International Version");
		
		try {
			productDao.saveProduct(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
				
		applicationContext.close();
	}

}
