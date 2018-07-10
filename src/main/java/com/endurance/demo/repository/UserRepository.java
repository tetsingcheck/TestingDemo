package com.endurance.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.endurance.demo.model.User;



public interface UserRepository extends CrudRepository<User,String>
{
	Optional<User> findById(String id);
}
