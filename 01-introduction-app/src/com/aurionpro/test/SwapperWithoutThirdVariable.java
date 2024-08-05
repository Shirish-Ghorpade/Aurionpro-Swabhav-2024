package com.aurionpro.test;

import java.util.Scanner;

public class SwapperWithoutThirdVariable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second Number");
		int number2 = scanner.nextInt();
		scanner.close();
		
		System.out.println("Before Swapping");
		System.out.println("Number1 : "+ number1 + "\t Number2 : "+ number2);
		
//		Swapping the two numbers
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;

		System.out.println("After Swapping");
		System.out.println("Number1 : "+ number1 + "\t Number2 : "+ number2);

	}

}
