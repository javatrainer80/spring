package com.tech2java.springjdbc;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tech2java.springjdbc.dto.Product;
import com.tech2java.springjdbc.util.QueryContants;

public class ProductDaoImpl implements ProductDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate=jdbcTemplate;
	}
	
	public void saveProduct(Product product) throws SQLException {
		jdbcTemplate.update(QueryContants.SAVE_PRODUCT,new Object[] {product.getProductId(),product.getProductName(),product.getProductDesc()} );
		System.out.println("Product saved successfully.");
	}
}
