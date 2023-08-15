package com.tech2java.springjdbc;

import java.sql.SQLException;
import java.util.List;

import com.tech2java.springjdbc.dto.Product;

public interface ProductDao {

	
	void saveProduct(Product product) throws SQLException;
	Product getProductById(Integer productId)throws SQLException;
	List<Product> getAllProducts() throws SQLException;
	String findProductNameById(Integer productId)throws SQLException;
	void deleteProductById(Integer productId) throws SQLException;
	void updateProduct(Integer productId,Product updatedProduct) throws SQLException;
	
	
}
