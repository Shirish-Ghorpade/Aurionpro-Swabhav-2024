package com.aurionpro.selection.test;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		if(number==0) {
			System.out.println(number+" is not a positive nor negative number");
		}else if(number>0){
			System.out.println(number+" is positive number");
		}else {
			System.out.println(number+" is negative number");
		}
	}

}
