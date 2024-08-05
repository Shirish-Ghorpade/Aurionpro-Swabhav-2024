package com.aurionpro.test;

import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner =  new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+"\t");
		}		
	}
}
