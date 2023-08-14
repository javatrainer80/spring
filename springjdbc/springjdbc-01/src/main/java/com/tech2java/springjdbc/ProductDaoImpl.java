package com.tech2java.springjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tech2java.springjdbc.dto.Product;

public class ProductDaoImpl implements ProductDao{

	public void saveProduct(Product product) throws SQLException {
	
		Connection connection=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/eis", "root", "root");
			pstmt=connection.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setString(3, product.getProductDesc());
			pstmt.executeUpdate();
			System.out.println("Product inserted successfully.");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			if(null!=connection) {
			  connection.close();
			}
			
			if(null!=pstmt) {
			  pstmt.close();
			}
		}
		
		
	}
	
	

}
