package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ProgramToReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int temp=number, pow=0, reverseNumber=0;
		while(temp>0) {
			++pow;
			temp /= 10;
		}
		temp=number;
		while(temp>0) {
			int rem = (temp%10);
			int subAns = rem*((int)Math.pow(10, pow));
			--pow;
			reverseNumber += subAns;
			temp /= 10;
		}
		
		
		System.out.println(number+" after reverse number "+reverseNumber);
	}
		
}
