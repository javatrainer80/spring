package com.tech2java.springcore;

//@Scope("prototype")  OR
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProductService {
	
	private String productDescription;
	
	

	public ProductService() {
		System.out.println("ProductService object is created by Container..");
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "ProductService [productDescription=" + productDescription + "]";
	}
	
	
	

}
