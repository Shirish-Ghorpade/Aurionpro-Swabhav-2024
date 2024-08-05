package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrintPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();

		for(int r=1; r<=number; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(r+"\t");
			}
			System.out.println();
		}
	}

}
