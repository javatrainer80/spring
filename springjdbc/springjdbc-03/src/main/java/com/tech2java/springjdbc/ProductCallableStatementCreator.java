package com.tech2java.springjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.jdbc.core.CallableStatementCreator;

import com.tech2java.springjdbc.dto.Product;

public class ProductCallableStatementCreator implements CallableStatementCreator {

	//create parameter constructor product object if required.
	private Product product;
	
	public ProductCallableStatementCreator(Product product) {
		this.product = product;
	}

	@Override
	public CallableStatement createCallableStatement(Connection con) throws SQLException {
		
		CallableStatement callableStatement=con.prepareCall("{call SAVE_PRODUCT(?,?,?)}");
		
		//set parameters if required
		callableStatement.setInt(1,product.getProductId());
		callableStatement.setString(2,product.getProductName());
		callableStatement.setString(3,product.getProductDesc());
		
		return callableStatement;
	}

}
