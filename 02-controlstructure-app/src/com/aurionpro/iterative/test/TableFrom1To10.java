package com.aurionpro.iterative.test;

import java.util.Scanner;

public class TableFrom1To10 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			
			for(int j=1; j<=10; j++) {
				System.out.print("\t"+i*j);
			}
			System.out.println();	
		}

	}

}
