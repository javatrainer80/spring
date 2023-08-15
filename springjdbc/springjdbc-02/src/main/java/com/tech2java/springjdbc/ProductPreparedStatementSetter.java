package com.tech2java.springjdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.tech2java.springjdbc.dto.Product;

public class ProductPreparedStatementSetter implements PreparedStatementSetter{

	private Product product;
	
	public ProductPreparedStatementSetter(Product product) {
		this.product = product;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		 
		ps.setInt(1, product.getProductId());
		ps.setString(2, product.getProductName());
		ps.setString(3, product.getProductDesc());
	}

}
