package com.tech2java.springjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

import com.tech2java.springjdbc.dto.Product;
import com.tech2java.springjdbc.util.QueryContants;

public class ProductPreparedStatementCreator implements PreparedStatementCreator{

	private Product product;
	
	public ProductPreparedStatementCreator(Product product) {
		this.product = product;
	}
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		 
		PreparedStatement pstmt=con.prepareStatement(QueryContants.SAVE_PRODUCT);
		
		pstmt.setInt(1, product.getProductId());
		pstmt.setString(2, product.getProductName());
		pstmt.setString(3, product.getProductDesc());
		return pstmt;
	}

	
}
