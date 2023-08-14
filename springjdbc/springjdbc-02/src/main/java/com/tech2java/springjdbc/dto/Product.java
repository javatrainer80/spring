package com.tech2java.springjdbc.dto;
/**
 * 
 * @author tech2java
 * use eis;
   CREATE TABLE `product` (
  `productId` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(100) NOT NULL,
  `productDesc` varchar(100) NOT NULL,
   PRIMARY KEY (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 *
 */
public class Product {
	
	private Integer productId;
	private String productName;
	private String productDesc;
	
	
	//Getters & Setters
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ "]";
	}
	
	
  
	

}
