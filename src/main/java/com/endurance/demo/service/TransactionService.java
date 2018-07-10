package com.endurance.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endurance.demo.model.Transaction;
import com.endurance.demo.repository.TransactionRepository;

@Service
public class TransactionService {
	
	
	@Autowired
	private TransactionRepository transactioRepository;
	
	public void addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		transactioRepository.save(transaction);
		
		
	}

}
