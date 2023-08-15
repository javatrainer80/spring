package com.tech2java.springjdbc;

import java.sql.SQLException;
import java.util.List;

import com.tech2java.springjdbc.dto.Product;

public interface ProductDao {

	
	public void insertProductsBatch(List<Product> products) throws SQLException;
	public void saveProduct(Product product) throws SQLException;
	
	
	
}
