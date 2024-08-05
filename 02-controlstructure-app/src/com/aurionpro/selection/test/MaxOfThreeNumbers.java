package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();
		System.out.println("Enter the third number");
		int number3 = scanner.nextInt();

		
		if(number1==number2 && number1==number3) {
			System.out.println("All numbers are equal");
		}
		else if(number1 > number2 && number1 > number3){
			System.out.println(number1+" is larger number than "+number2+" and "+number3);
		}
		else if(number2 > number3){
			System.out.println(number2+" is larger number than "+number1+" and "+number3);
		}
		else{
			System.out.println(number3+" is larger number than "+number1+" and "+number2);
		}


	}

}
