package com.aurionpro.srp.violation.test;

import com.aurionpro.srp.violation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice invoice = new Invoice("jdsbv", "Tax", 450000, 5);
		invoice.printInvoice();
		invoice.calculateTax();

	}

}
