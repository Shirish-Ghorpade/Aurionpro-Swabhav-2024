package com.aurionpro.solution.model;

//import com.sun.javafx.logging.Logger;

public class TaxCalculator {
	
	
//	Here we create reference of interface rather than concrete class
	ILogger logger;
	
	public TaxCalculator(ILogger logger) {
		super();
		this.logger = logger;
	}
	
	public ILogger getLogger() {
		return logger;
	}
	
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public void calculateTax(int amount, int rate) {
		int tax=0;
		try {
			tax = amount/rate;
			System.out.println("Tax is "+tax);
		}catch (Exception e) {
			// TODO: handle exception
			logger.log("Divide by zero");
		}
	}
}
