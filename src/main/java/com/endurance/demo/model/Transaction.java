package com.endurance.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "transactions")
public class Transaction {
	
	@Id
	private String id;
	private String email;
	private String productName;
	private String amount;
	
	
	public Transaction(String id, String email,String productName , String amount) {
		super();
		this.id = id;
		this.email = email;
		this.productName = productName;
		this.amount=amount;
	}
	
	public Transaction()
	{
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


	

}
