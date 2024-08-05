package com.aurionpro.calculator;

public class ArithmeticOperations {
//	Addition method
	void addition(int num1, int num2) {
		System.out.println("The addition of "+num1+" and "+ num2 +" is "+(num1+num2));
//		System.out.printf("The addition of %d and %d is %d", num1, num2, num1+num2).println();	
	}
	
//	Subtraction method
	void subtraction(int num1, int num2) {
		System.out.println("The subtraction of "+num1+" and "+ num2 +" is "+(num1-num2));
	}
	
//	Multiplication method
	void multiplication(int num1, int num2) {
		System.out.println("The multiplication of "+num1+" and "+ num2 +" is "+(num1*num2));
	}
	
//	Division method
	void division(int num1, int num2) {
//		Handling divide by zero case
		if(num2==0) System.out.println("Cannot divide by zero");
		else System.out.println("The division of "+num1+" and "+ num2 +" is "+(num1/num2));
	}
}
