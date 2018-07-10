package com.endurance.demo.service;


import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.endurance.demo.model.User;




@Service
public class UserService {
	
	
	private List<User> users = Arrays.asList(
			new User("1","user1","user1@test.com"),
			new User("2","user2","user2@test.com"),
			new User("3","user3","user3@test.comm"),
			new User("4","user4","user4@test.comm")
			   
			);

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}
	
	public User getUser(String id)
	{
		return users.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	
	

}
