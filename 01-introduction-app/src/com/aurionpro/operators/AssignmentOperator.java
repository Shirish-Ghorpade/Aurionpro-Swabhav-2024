package com.aurionpro.operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second Number");
		int number2 = scanner.nextInt();
		scanner.close();
		
//		Simple assignment 
		int temp = number1;
		System.out.println("The value of temp is "+temp);
		
//		+=
		System.out.println("The value of number1 is "+number1);
		System.out.println("The value of number2 is "+number2);
		
		number1 += number2;
		System.out.println("The new value of number1 is "+number1);
		
//		-=
		System.out.println("The value of number1 is "+number1);
		System.out.println("The value of number2 is "+number2);
		
		number1 -= number2;
		System.out.println("The new value of number1 is "+number1);

//		*=
		System.out.println("The value of number1 is "+number1);
		System.out.println("The value of number2 is "+number2);
		
		number1 *= number2;
		System.out.println("The new value of number1 is "+number1);

//		/=
		System.out.println("The value of number1 is "+number1);
		System.out.println("The value of number2 is "+number2);
		
		number1 /= number2;
		System.out.println("The new value of number1 is "+number1);
		
//		%=
		System.out.println("The value of number1 is "+number1);
		System.out.println("The value of number2 is "+number2);
		
		number1 %= number2;
		System.out.println("The new value of number1 is "+number1);
		
	}

}
