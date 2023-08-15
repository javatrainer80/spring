package com.tech2java.springjdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tech2java.springjdbc.dto.Product;
import com.tech2java.springjdbc.util.QueryContants;

//If we use JdbcDaoSupport - no need to  declare jdbcTemplate- it finds the dataSource from the beans.xml .
//use getJdbcTemplate() instead of jdbcTemplate
public class ProductDaoImpl extends JdbcDaoSupport implements ProductDao{
	
	//batch update
	public void insertProductsBatch(List<Product> products)throws SQLException {
		
		getJdbcTemplate().batchUpdate(QueryContants.SAVE_PRODUCT, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				
				Product product=products.get(i);
				
				ps.setInt(1, product.getProductId());
				ps.setString(2, product.getProductName());
				ps.setString(3, product.getProductDesc());
				
			}
			
			@Override
			public int getBatchSize() {
				
				return products.size();
			}
		});
	}

	@Override
	public void saveProduct(Product product) throws SQLException {
		
	
		ArrayList<SqlParameter> parametrs=new ArrayList<>();
		getJdbcTemplate().call(new ProductCallableStatementCreator(product),parametrs);
		
		
	}
	
}
