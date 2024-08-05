package com.aurionpro.operators;

import java.util.Scanner;

public class LogicalOperator {
//	The logical && operator doesn't check the second condition if the first condition is false. 
//	It checks the second condition only if the first one is true.
	void logicalAND(boolean flag1, boolean flag2) {
		// Logical AND
        boolean resultAnd = flag1 && flag2; 
        System.out.println("flag1 && flag2: " + resultAnd);
	}
	void logicalOR(boolean flag1, boolean flag2) {
		 // Logical OR
        boolean resultOr = flag1 || flag2; 
        System.out.println("flag1 || flag2: " + resultOr);
	}
	void logicalNOT(boolean flag1) {
		// Logical NOT
        boolean resultNot = !flag1; 
        System.out.println("!flag1: " + resultNot);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first boolean value");
		boolean flag1 = scanner.nextBoolean();
		System.out.println("Enter second boolean value");
		boolean flag2 = scanner.nextBoolean();
		scanner.close();
		
        LogicalOperator obj = new LogicalOperator();
        obj.logicalAND(flag1, flag2);
        obj.logicalOR(flag1, flag2);
        obj.logicalNOT(flag1);

	}

}
