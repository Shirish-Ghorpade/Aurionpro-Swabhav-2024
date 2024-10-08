package com.aurionpro.srp.solution.model;

public class InvoicePrinter {
	// InvoicePrinter is part of invoice in violation package so, we split them to
	// follow SRP so, now we require properties and methods of Invoice class.
	// We want to access the method and properties of Invoice class so we create the
	// reference inside the InvoicePrinter
	// Here it is HAS-A relationship in which we achieve aggregation
	// Why it is HAS-A relationship
	// -------> Invoice is not a part of InvoicePrinter it independent class when
	// InvoicePrinter is
	// destroyed but marker do not destroyed we can use it
	Invoice invoice;
	// Here we add reference the as per our requirement. here we require the
	// TaxCalculator also we take reference of them also.
	TaxCalculator calculator;

	// Here we want the access of properties of Invoice and TaxCalcultor class then
	// 1. we get that object in the constructor
	// 2. Pass the object of both of them when we call Invoice printer
	// eg. here we call them in the main method.

	// Invoice invoice = new Invoice("id100023", "Shirish", 9000.98, 5);
	// TaxCalculator taxCalculator = new TaxCalculator(invoice);
	// InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);

	/////////////////////////// OR////////////////////////////////////////

//	InvoicePrinter invoicePrinter = new InvoicePrinter(new Invoice("id100023", "Shirish", 9000.98, 5),
//			new InvoicePrinter(invoice, taxCalculator));
	

	public InvoicePrinter(Invoice invoice, TaxCalculator calculator) {
		super();
		this.invoice = invoice;
		this.calculator = calculator;
	}

	public void printInvoice() {
		System.out.println("Print invoice");
		System.out.println("Invoice [id=" + invoice.getId() + ", description=" + invoice.getDescription() + ", amount="
				+ invoice.getAmount() + ", tax=" + invoice.getTax() + " % " + " payable amount is "
				+ calculator.calculateTax() + "]");
	}

}
