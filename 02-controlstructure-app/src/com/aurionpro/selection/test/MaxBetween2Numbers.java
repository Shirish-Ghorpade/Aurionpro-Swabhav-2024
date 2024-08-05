package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaxBetween2Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();
		
		if(number1==number2) {
			System.out.println("Both numbers are equal");
		}else if(number1>number2){
			System.out.println(number1+" is larger number than "+number2);
		}else {
			System.out.println(number2+" is larger number than "+number1);
		}

	}

}
