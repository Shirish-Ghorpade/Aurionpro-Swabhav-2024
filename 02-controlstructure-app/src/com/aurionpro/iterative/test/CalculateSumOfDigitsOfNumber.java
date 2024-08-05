package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CalculateSumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int sum=0;
		while(number>0) {
			sum += (number%10);
			number /= 10;
		}
		System.out.println("The sum of "+number+" is "+sum);

	}

}
