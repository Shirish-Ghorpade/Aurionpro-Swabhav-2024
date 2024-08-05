package com.aurionpro.iterative.test;

import java.util.Iterator;
import java.util.Scanner;

public class CalculateFactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial *= i;
		}
		
		System.out.println("Factorial of "+number+" is "+factorial);
	}

}
