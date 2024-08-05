package com.aurionpro.iterative.test;

import java.util.Scanner;

public class NumberIsArmstrongNumberOrNot {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int sum=0, pow=0;
		int temp=number;
		while(temp>0) {
			++pow;
			temp /= 10;
		}
		temp=number;
		while(temp>0) {
			int rem = (temp%10);
			sum += (int)Math.pow(rem, pow);
			temp /= 10;
		}
		
		if(sum == number)
			System.out.println(number+" is an armstrong number");
		else
			System.out.println(number+" is not an armstrong number");

	}

}
