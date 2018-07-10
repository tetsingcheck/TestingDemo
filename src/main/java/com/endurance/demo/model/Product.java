package com.endurance.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	String id ;
	String productCategory;
	String productName;
	
	public Product(String id, String productCategory, String productName) {
		super();
		this.id = id;
		this.productCategory = productCategory;
		this.productName = productName;
	}
	
	public Product()
	{
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	
	
	
	

}
