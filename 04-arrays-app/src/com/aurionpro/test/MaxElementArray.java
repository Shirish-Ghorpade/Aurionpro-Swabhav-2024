package com.aurionpro.test;

import java.util.Scanner;

public class MaxElementArray {

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
		int max=0;
		for (int i = 0; i < size; i++) {
			max = Math.max(max,array[i]);
		}
		System.out.println("Maximum value is "+ max);

	}

}
