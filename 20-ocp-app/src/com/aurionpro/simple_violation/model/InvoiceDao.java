package com.aurionpro.simple_violation.model;

//public class InvoiceDao {

//	Invoice invoice;
//
//	public InvoiceDao(Invoice invoice) {
//		super();
//		this.invoice = invoice;
//	}
//
//	public void saveToDB() {
//		System.out.println("Saving to DB");
//	}
//}

//Now We want to add the new method to the InvoiceDao
public class InvoiceDao {
	Invoice invoice;

	public InvoiceDao(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	public void saveToDB() {
		System.out.println("Saving to DB");
	}

	public void saveToFile() {
		System.out.println("Saving to File");
	}
}

// It do not extend it. It modify the previous program --> violates OCP