package com.aurionpro.iterative.test;

public class OddNumberPrinter {

	public static void main(String[] args) {
		
		int i=1;
		while (i<=100) {
//			Printing odd numbers
			System.out.println("Printing odd numbers :");
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
