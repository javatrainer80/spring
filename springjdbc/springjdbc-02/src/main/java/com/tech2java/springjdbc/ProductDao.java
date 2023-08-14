package com.tech2java.springjdbc;

import java.sql.SQLException;

import com.tech2java.springjdbc.dto.Product;

public interface ProductDao {

	
	void saveProduct(Product product) throws SQLException;
}
