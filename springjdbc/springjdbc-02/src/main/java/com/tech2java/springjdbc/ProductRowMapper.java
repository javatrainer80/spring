package com.tech2java.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tech2java.springjdbc.dto.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product=new Product();
		
		product.setProductId(rs.getInt("productId"));
		product.setProductName(rs.getString("productName"));
		product.setProductDesc(rs.getString("productDesc"));
		
		return product;
	}
	
	

}
