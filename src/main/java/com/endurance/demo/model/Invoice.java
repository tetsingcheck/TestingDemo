package com.endurance.demo.model;


public class Invoice {
	
	private String invoiceid;
	private String amount;
	
	public Invoice()
	{
		
	}

	
	public Invoice(String invoiceid, String amount) {
		super();
		this.invoiceid = invoiceid;
		this.amount = amount;
	}


	public String getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	
}
