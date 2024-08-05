package com.aurionpro.iterative.test;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i=2;
		while (i<=100) {
			sum += i;
			i+=2;
		}
		System.out.println("Sum of one to hundred is "+ sum);
	}

}
