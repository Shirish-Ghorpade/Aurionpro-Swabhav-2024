package com.aurionpro.test;

import java.util.Scanner;

public class CheckNumberExitInArray {

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
		System.out.println("Enter the element which we want to find");
		int number = scanner.nextInt();
		boolean flag=false;
		for (int i = 0; i < size; i++) {
			if(number==array[i]) {
				flag=true;
			}
		}
		if(flag)
			System.out.println(number+" exit in an array");
		else 
			System.out.println(number+" is not exist in array");
	}

}
