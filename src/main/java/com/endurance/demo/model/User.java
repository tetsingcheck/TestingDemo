package com.endurance.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "users")
public class User {
	
	@Id
	private String id;
	private String username;
	private String email;
	
	
	public User(String id , String username,String email) {
		super();
		this.id = id;
		this.username = username;
		this.email=email;
		
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUser_id() {
		return id;
	}

	public void setUser_id(String user_id) {
		this.id = user_id;
	}

	
	public User()
	{
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
