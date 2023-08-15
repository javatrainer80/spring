package com.tech2java.springjdbc;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tech2java.springjdbc.dto.Product;

public class SpringJDBCTest {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		ProductDao productDao=applicationContext.getBean("productDao",ProductDaoImpl.class);
		/***********SAVE***********************/
		//Prepare Product Object
		/*
		Product product=new Product();
		product.setProductId(1005);
		product.setProductName("SAMSUNG Galaxy A13");
		product.setProductDesc("SAMSUNG Galaxy A13 (SM-A137F/DS) Dual SIM, 64GB + 4GB, Factory Unlocked GSM, International Version");
		
		try {
			productDao.saveProduct(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		////////////////////////////////////////
		
		//Get Product
		
		/*
		Product product;
		try {
			product = productDao.getProductById(1002);
			System.out.println(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		//GET ALL PRODUCTS
		List<Product> products=Collections.emptyList();
		try {
			products = productDao.getAllProducts();
			for(Product product:products) {
				System.out.println(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		//GET Product Name by ID
		try {
			String name = productDao.findProductNameById(1001);
			System.out.println(name);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		*/
		
		/*
		try {
			productDao.deleteProductById(1005);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		*/
		try {
			
			Product product=new Product();
			product.setProductName("SAMSUNG Galaxy A16");
			product.setProductDesc("SAMSUNG Galaxy A16 (SM-A137F/DS) Dual SIM, 64GB + 4GB, Factory Unlocked GSM, International Version");
			
			productDao.updateProduct(1009, product);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		applicationContext.close();
	}

}
