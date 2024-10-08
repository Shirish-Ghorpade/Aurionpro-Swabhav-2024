package com.aurionpro.solution.test;

import com.aurionpro.solution.model.DBLogger;
import com.aurionpro.solution.model.FileLogger;
import com.aurionpro.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		
		TaxCalculator taxCalculator = new TaxCalculator(new DBLogger());
		taxCalculator.calculateTax(1000, 5);
		
//		TaxCalculator taxCalculator1 = new TaxCalculator(new FileLogger());
//		taxCalculator1.calculateTax(1000, 0);
		
		taxCalculator.setLogger(new FileLogger());
		taxCalculator.calculateTax(1000, 0);

	}
}
