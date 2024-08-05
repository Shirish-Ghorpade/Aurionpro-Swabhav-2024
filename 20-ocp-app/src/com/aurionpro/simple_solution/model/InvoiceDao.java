package com.aurionpro.simple_solution.model;

public interface InvoiceDao {
	public void save();
}

// If we want to create new saving location rather than DB and File then just
// create new class and implement InvoiceDao interface and implement their class. 