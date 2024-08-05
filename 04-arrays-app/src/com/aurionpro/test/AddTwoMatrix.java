package com.aurionpro.test;

import java.util.Scanner;

public class AddTwoMatrix {
	private static int[][] creatingMatrix() {
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
		return matrix;
	}
	private static void printingMatrix(int matrix[][]) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				 System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private static void additionOfMatrix(int matrix1[][], int matrix2[][], int ans[][]) {
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[0].length; j++) {
				 ans[i][j] = matrix1[i][j]+matrix2[i][j];
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int matrix1[][] = creatingMatrix();
		int matrix2[][] = creatingMatrix();
//		printingMatrix(matrix1);
//		printingMatrix(matrix2);
		

		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			System.out.println("Rows and columns of two matrix should be same");
			return;
		}	
		int ans[][] = new int[matrix1.length][matrix1[0].length];
		additionOfMatrix(matrix1, matrix2, ans);
		
		printingMatrix(ans);

	}

}
