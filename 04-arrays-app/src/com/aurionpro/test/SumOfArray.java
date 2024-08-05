package com.aurionpro.test;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		int sum=0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		System.out.println("Sum of an array is "+ sum);
	}
}
