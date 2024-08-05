package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.Invoice;
import com.aurionpro.srp.solution.model.InvoicePrinter;
import com.aurionpro.srp.solution.model.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice invoice = new Invoice("dsklfj", "sdfkjsldf", 9000.98, 5);
		TaxCalculator taxCalculator = new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
		invoicePrinter.printInvoice();
	}

}
