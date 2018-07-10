package com.endurance.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.endurance.demo.model.Invoice;
import com.endurance.demo.model.Transaction;
import com.endurance.demo.model.Util;
import com.endurance.demo.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	private Util util = new Util();
	
	@GetMapping("/transaction")
	public Transaction makeTransaction(@RequestParam("email") String email,@RequestParam("productname") String productname)
	{
		Transaction transaction = new Transaction();
		transaction.setEmail(email);
		transaction.setProductName(productname);
		transaction.setId(util.getRandomId(4));
		// make a function in Util class for tax , and fetching amount based on product name and then set amount in transaction object
		transactionService.addTransaction(transaction);
		return transaction;
		
	}
	
	
	@RequestMapping("/pay")
    public ModelAndView payForm() {
		  
		System.out.println("in pay");
       
        return new ModelAndView("pay","command",new Invoice());
    }
	
	@RequestMapping(value="/confirmPay",method=RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("SpringWeb")Invoice invoice,ModelMap model)
	{
		  model.addAttribute("invoice", invoice.getInvoiceid());
	      model.addAttribute("amount", invoice.getAmount());
	      System.out.println(invoice.getInvoiceid() + invoice.getAmount());
	      return new ModelAndView("result");
		
	}

}
