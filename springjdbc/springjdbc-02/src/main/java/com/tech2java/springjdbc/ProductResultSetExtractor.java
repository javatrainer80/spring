package com.tech2java.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.tech2java.springjdbc.dto.Product;

public class ProductResultSetExtractor implements ResultSetExtractor<List<Product>>{

	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Product> productList=new ArrayList<>();
		
		while(rs.next()) {
			Product product=new Product();
			product.setProductId(rs.getInt("productId"));
			product.setProductName(rs.getString("productName"));
			product.setProductDesc(rs.getString("productDesc"));
			
			productList.add(product);
		}
		
		return productList;
	}
	
	
	

}
