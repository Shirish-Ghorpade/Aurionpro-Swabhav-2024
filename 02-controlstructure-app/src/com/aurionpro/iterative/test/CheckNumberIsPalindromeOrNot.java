package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CheckNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int temp=number, pow=0, reverseNumber=0;
		while(temp>0) {
			++pow;
			temp /= 10;
		}
		while(temp>0) {
			int rem = (temp%10);
			int subAns = rem*(int)Math.pow(10, pow);
			--pow;
			reverseNumber += subAns;
			temp /= 10;
		}
		if(number==reverseNumber)
			System.out.println(number+" is a palindrome number");
		else
			System.out.println(number+" is not a palindrome number");
			
	}

}
