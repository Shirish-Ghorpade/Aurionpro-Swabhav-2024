package com.aurionpro.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		int result1 = addition(number1, number2);
		System.out.println("Addition is "+result1);
		
		int result2 = subtraction(number1, number2);
		System.out.println("Subtraction"+result2);
		
		int result3 = multiplication(number1, number2);
		System.out.println("Divison"+result3);
		
		
		

	}
	private static int addition(int number1, int number2) {
		return number1+number2;
	}
	private static int subtraction(int number1, int number2) {
		return number1-number2;
	}
	private static int multiplication(int number1, int number2) {
		return number1*number2;
	}
	private static int division(int number1, int number2) {
		return number1/number2;
	}

}
