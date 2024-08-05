package com.aurionpro.test;

import java.util.Scanner;

public class FindAllPeakElements {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Ans : ");
		if(array.length==1) {
			System.out.println(array[0]);
			return;
		}
		if(array[0]>array[1]) {
			System.out.println(array[0]);
		}
		if(array[size-1]>array[size-2]) {
			System.out.println(array[size-1]);
		}
		for(int i=1; i<size-1; i++) {
			if(array[i]>array[i-1] && array[i]>array[i+1]) {
				System.out.println(array[i]);
			}
		}
		
		
		
		
//		int left=0, right=size-1;
//		while (left<=right) {
//			int mid = (right)+((left-right)/2);
//			if(mid>0 && mid<size-1) {
//				if(array[mid-1] < array[mid] && array[mid+1] < array[mid]) {
//					System.out.println(array[mid]);
//					break;
//				}
//				else if(array[mid-1]>array[mid]) {
//					right=mid-1;
//				}
//				else if(array[mid+1]>array[mid]) {
//					left=mid+1;
//				}
//			}
////			Avoid arrayOutOfbound error
//			if(mid==0) {
//				if(array[mid]>array[mid+1]) {
//					System.out.println(array[mid]);
//				}
//			}
//			if(mid==size-1) {
//				if(array[size-1]>array[size-2]) {
//					System.out.println(array[size-1]);
//				}
//			}
//			
					
	}
}

