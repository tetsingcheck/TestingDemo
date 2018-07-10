package com.endurance.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.endurance.demo.model.Transaction;
import com.endurance.demo.model.User;
import com.endurance.demo.service.ProductService;
import com.endurance.demo.service.TransactionService;
import com.endurance.demo.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
		
	}
	
	@GetMapping("/user")
	public User getUser(@RequestParam("userid") String userid)
	{
		return userService.getUser(userid);
		
	}
	
	

}
