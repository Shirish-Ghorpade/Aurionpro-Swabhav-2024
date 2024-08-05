package com.aurionpro.test;

import java.util.Scanner;

public class SumOfTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns : ");
		int cols = scanner.nextInt();
		
		int matrix[][] = new int[rows][cols];
		
		System.out.println("Enter the elements :");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(matrix[i][j]+"\t"); 
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				 sum += matrix[i][j];
			}
		}
		System.out.println("Sum of an array is "+sum);
	}

}
