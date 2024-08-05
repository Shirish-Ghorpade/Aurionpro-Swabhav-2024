package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		int i=2;
		while(i<number) {
			if(number%i==0) {
				break;
			}
			i++;
		}
		if(i>=number) 
			System.out.println(number +" is a prime number");
		else 
			System.out.println(number+" is not a prime number");

	}

}
