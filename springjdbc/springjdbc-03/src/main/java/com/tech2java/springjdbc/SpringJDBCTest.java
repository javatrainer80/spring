package com.tech2java.springjdbc;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech2java.springjdbc.dto.Product;

public class SpringJDBCTest {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		ProductDao productDao=applicationContext.getBean("productDao",ProductDaoImpl.class);
		
		/*
		
		Product product1=new Product();
		product1.setProductId(1000);
		product1.setProductName("SAMSUNG Galaxy A13");
		product1.setProductDesc("SAMSUNG Galaxy A13 (SM-A137F/DS) Dual SIM, 64GB + 4GB, Factory Unlocked GSM, International Version");
		
		Product product2=new Product();
		product2.setProductId(1001);
		product2.setProductName("SAMSUNG Galaxy A24");
		product2.setProductDesc("SAMSUNG Galaxy A24 (SM-A137F/DS) Dual SIM, 64GB + 4GB, Factory Unlocked GSM, International Version");
		
		List<Product> productList=new ArrayList<>();
		
		productList.add(product1);
		productList.add(product2);
		
		try {
			productDao.insertProductsBatch(productList);
			System.out.println("Products saved successfully..");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		*/
		
		//Using stored procedure
		try {
			
			Product product=new Product();
			product.setProductId(1004);
			product.setProductName("SAMSUNG Galaxy A58");
			product.setProductDesc("SAMSUNG Galaxy A58 (SM-A137F/DS) Dual SIM, 64GB + 4GB, Factory Unlocked GSM, International Version");
			
			
			productDao.saveProduct(product);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		applicationContext.close();
	}

}
