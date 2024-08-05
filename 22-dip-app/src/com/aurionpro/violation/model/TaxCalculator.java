package com.aurionpro.violation.model;

public class TaxCalculator {
	
//	Here we dbLogger is depend on concreate class ---> It violates DIP
	DBLogger dbLogger;
	
	public TaxCalculator(DBLogger dbLogger) {
		super();
		this.dbLogger = dbLogger;
	}

	public void calculateTax(int amount, int rate) {
		int tax=0;
		try {
			tax = amount/rate;
			System.out.println("Tax is "+tax);
		}catch (Exception e) {
			// TODO: handle exception
			new DBLogger().log("Divide by zero");
		}
	}
}
