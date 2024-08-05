package com.aurionpro.violation.test;

import com.aurionpro.violation.model.DBLogger;
import com.aurionpro.violation.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		DBLogger dbLogger = new DBLogger();
		TaxCalculator taxCalculator = new TaxCalculator(dbLogger);
		taxCalculator.calculateTax(1000, 5);
		TaxCalculator taxCalculator1 = new TaxCalculator(dbLogger);
		taxCalculator1.calculateTax(1000, 0);
	}

}

// DIP : Dependency inversion means CLASS SHOULD DEPEND ON INTERFACE RATHER THAN CONCERTE CLASSES
// see the comments in violation and solution package
