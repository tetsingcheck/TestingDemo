package com.endurance.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.endurance.demo.model.Transaction;


public interface TransactionRepository extends CrudRepository<Transaction,String>{

}
