package com.aurionpro.violation.model;

public class Invoice {
	// We want to access the method and properties of marker class so we create the
	// reference in invoice
	// Here it is HAS-A relationship in which we achieve aggregation
	// Why it is HAS-A relationship
	// -------> Marker is not a part of Invoice it independent class when Invoice is
	// destroyed but marker do not destroyed we can use it
	private Marker marker;
	// Here we add reference the as per our requirement
	private int quantity;

	public Invoice(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public int calculateTotal() {
		return marker.getPrice() * quantity;
	}

	public void printInvoice() {
		System.out.println("Print invoice");
	}

	public void saveToDB() {
		System.out.println("Save to DB");
	}

	// SRP PRINCIPLE : CLASS SHOULD HAVE ONLY ONE REASON TO CHANGED.
	
	// Problem : If calculateTotal changed then we change logic of class, then
	// printInvoice changed logic of class and so on.

	// Solution : split them in separate class (CLASS SHOULD HAVE ONLY ONE REASON TO
	// CHANGED.) --> one class have one responsibility
	
	
}
