package com.aurionpro.operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second Number");
		int number2 = scanner.nextInt();
		scanner.close();
		
//		Finding the maximum number from two number
		int maxNumber=0;
//		if(number1>=number2)
//		{
//		    maxNumber = number1;
//		}
//		else
//		{
//		    maxNumber = number2;
//		}
		maxNumber = (number1>=number2) ? number1 : number2;
		System.out.println("Maximum Number between "+number1+" and "+number2+" is "+ maxNumber);
		
	}

}
