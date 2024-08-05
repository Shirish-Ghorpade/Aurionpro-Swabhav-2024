package com.aurionpro.simple_solution.model;

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
}
