package com.aurionpro.selection.test;

import java.util.Scanner;

public class SeasonChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month digit");
		int monthNumber = scanner.nextInt();
		
		switch (monthNumber) {
			case 1:
				System.out.println("Winter");
				break;
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Summer");
				break;
			case 6:
			case 7:
			case 8:
			case 9: System.out.println("Rainy");
				break;
			case 10:
			case 11:
			case 12: System.out.println("Winter");
				break;
			default:
				System.out.println("Please enter valid month");
		}
	}
}
