package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CheckPerfectNumberOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int temp=number;
		int i=number/2;
		int sum=0;
		while(i>0) {
			if(number%i==0) {
				sum += i;
			}
			i--;
		}
		if(sum==number) 
			System.out.println(number+" is a perfect number");
		else
			System.out.println(number+" is a perfect number");
		

	}

}
