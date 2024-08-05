package com.aurionpro.operators;

import java.util.Scanner;

public class ArithmeticOperators {
	
//	Addition Operator
	void addition(int number1, int number2) {
		System.out.println("The addition of "+number1+" and "+ number2 +" is "+(number1+number2));
//		System.out.printf("The addition of %d and %d is %d", number1, number2, number1+number2).println();	
	}
	
//	Subtraction Operator
	void subtraction(int number1, int number2) {
		System.out.println("The subtraction of "+number1+" and "+ number2 +" is "+(number1-number2));
	}
	
//	Multiplication Operator
	void multiplication(int number1, int number2) {
		System.out.println("The multiplication of "+number1+" and "+ number2 +" is "+(number1*number2));
	}
	
//	Division Operator
	void division(int number1, int number2) {
//		Handling divide by zero case
		if(number2==0) System.out.println("Cannot divide by zero");
		else System.out.println("The division of "+number1+" and "+ number2 +" is "+(number1/number2));
	}
//	Modulo Operator
	void remainder(int number1, int number2) {
		System.out.println("The remainder we get after dividing "+number1+" by "+number2+" is "+ (number1%number2));
	}
	
	
	public static void main(String[] args) {
//		Creating the object of Scanner class
		Scanner scanner = new Scanner(System.in);
		
//		Taking input from user
		System.out.print("Enter the First number : ");
		int number1 = scanner.nextInt();
		System.out.print("Enter the Second number : ");
		int number2 = scanner.nextInt();
		scanner.close();
		
		ArithmeticOperators obj = new ArithmeticOperators();
		
//		Use ArithmeticOperations object to call methods
		obj.addition(number1, number2);
		obj.subtraction(number1, number2);
		obj.multiplication(number1, number2);
		obj.division(number1, number2);
		obj.remainder(number1, number2);

	}

}
