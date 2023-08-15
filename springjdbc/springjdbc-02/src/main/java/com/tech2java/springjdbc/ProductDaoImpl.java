package com.tech2java.springjdbc;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tech2java.springjdbc.dto.Product;
import com.tech2java.springjdbc.util.QueryContants;

public class ProductDaoImpl implements ProductDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate=jdbcTemplate;
	}
	
	/*
	public void saveProduct(Product product) throws SQLException {
		jdbcTemplate.update(QueryContants.SAVE_PRODUCT,new Object[] {product.getProductId(),product.getProductName(),product.getProductDesc()} );
		System.out.println("Product saved successfully.");
	}
	*/
	/*
	public void saveProduct(Product product) throws SQLException {
		jdbcTemplate.update(QueryContants.SAVE_PRODUCT,product.getProductId(),product.getProductName(),product.getProductDesc());
		System.out.println("Product saved successfully.");
	}
	*/
	
	//PreparedStatementSetter
	/*
	public void saveProduct(Product product) throws SQLException {
		jdbcTemplate.update(QueryContants.SAVE_PRODUCT,new ProductPreparedStatementSetter(product));
		System.out.println("Product saved successfully.");
	}
	*/
	
	//PreparedStatementCreator
	public void saveProduct(Product product) throws SQLException {
		jdbcTemplate.update(new ProductPreparedStatementCreator(product));
		System.out.println("Product saved successfully.");
	}

	/*
	@Override
	public Product getProductById(Integer productId) throws SQLException {
		//Deprecated below one- change the argument order
		//jdbcTemplate.queryForObject("select *from product where productId=?",new Object[] {productId},new ProductRowMapper());
		Product product=jdbcTemplate.queryForObject("select *from product where productId=?",new ProductRowMapper(),new Object[] {productId});
		return product;
	}
	*/
	
	@Override //get product by BeanPropertyRowMapper
	public Product getProductById(Integer productId) throws SQLException {
		
		Product product=jdbcTemplate.queryForObject(QueryContants.GET_PRODUCT_BY_ID,
				new BeanPropertyRowMapper<Product>(Product.class),new Object[] {productId});
		return product;
	}

	/*
	@Override   //GET ALL PRODCTS BY BeanPropertyRowMapper 
	public List<Product> getAllProducts() throws SQLException {
		
		List<Product> productList=jdbcTemplate.query(QueryContants.GET_ALL_PRODUCTS, new BeanPropertyRowMapper<Product>(Product.class));
		return productList;
	}
	*/
	
	/*
	@Override  //MAPPING ROW MANUALLY
	public List<Product> getAllProducts() throws SQLException {
		
		List<Product> productList=new ArrayList<>();
		
		List<Map<String, Object>> rows=jdbcTemplate.queryForList(QueryContants.GET_ALL_PRODUCTS);
		System.out.println(rows);
		for(Map<String, Object> row:rows) {
			
			Product product=new Product();
			product.setProductId((Integer)row.get("productId"));
			product.setProductName((String)row.get("productName"));
			product.setProductDesc((String)row.get("productDesc"));
			
			productList.add(product);
		}
		return productList;
	}
	
	*/
	
	@Override  //USING ResultSetExtractor
	public List<Product> getAllProducts() throws SQLException {
		
		List<Product> products=jdbcTemplate.query(QueryContants.GET_ALL_PRODUCTS, new ProductResultSetExtractor());
		
		return products;
	}

	@Override
	public String findProductNameById(Integer productId) throws SQLException {
		
		String productName=jdbcTemplate.queryForObject(QueryContants.GET_PRODUCT_NAME_BY_ID, String.class,productId);
		return productName;
	}

	@Override
	public void deleteProductById(Integer productId)throws SQLException {
		
		jdbcTemplate.update(QueryContants.DELETE_PRODUCT_BY_ID, productId);
		System.out.println("Product deleted with ID="+productId);
		
	}

	@Override
	public void updateProduct(Integer productId, Product updatedProduct) throws SQLException {
	
		Product product= getProductById(productId);
		if(null!=product) {
			System.out.println("Inside if condition");
			//perform update operation
			jdbcTemplate.update(QueryContants.UPDATE_PRODUCT, new Object[] {updatedProduct.getProductName(),updatedProduct.getProductDesc(),productId});
		}
		
	}
	
	
	
}
