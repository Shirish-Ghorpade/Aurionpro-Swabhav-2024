package com.aurionpro.calculator;
import java.util.Scanner;


public class BasicCalculator {
	
	public static void main(String[] args) {
//		Creating the object of Scanner class
		Scanner scanner = new Scanner(System.in);
		
//		Taking input from user
		System.out.print("Enter the First number : ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the Second number : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
//		Creating object of ArithmeticOperations
		ArithmeticOperations obj = new ArithmeticOperations();
		
//		Use ArithmeticOperations object to call methods
		obj.addition(num1, num2);
		obj.subtraction(num1, num2);
		obj.multiplication(num1, num2);
		obj.division(num1, num2);		
		
	}

}
