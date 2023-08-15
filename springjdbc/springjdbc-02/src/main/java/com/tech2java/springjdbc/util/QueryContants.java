package com.tech2java.springjdbc.util;

public interface QueryContants {

	
	String SAVE_PRODUCT="insert into product values(?,?,?)";
	
	String GET_PRODUCT_BY_ID="select *from product where productId=?";
	
	
	String GET_ALL_PRODUCTS="select *from product";
	
	String GET_PRODUCT_NAME_BY_ID="select productName from product where productId=?";
	
	String DELETE_PRODUCT_BY_ID="delete from product where productId=?";
	
	String UPDATE_PRODUCT="update product set productName=?, productDesc=? where productId=?";
	
	
}
