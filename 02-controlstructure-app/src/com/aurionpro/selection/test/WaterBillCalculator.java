package com.aurionpro.selection.test;

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the units consumed");
		int consumedUnits = scanner.nextInt();
		
//		Fixed values which is given in program
		int firstLimit=100, secondLimit=250, meterCharge=75;
		
//		Variables for storing output
		int charge=0, totalWaterBill=0;
		
		if(consumedUnits <= firstLimit) {
//			Charges consumed units with in first limit is added
			charge += consumedUnits*5;
		}
		else if(consumedUnits <= secondLimit) {
//			charges of with in first limit is added
			charge += firstLimit*5;
//			charges of with in second limit is added
			charge += (secondLimit-firstLimit)*10;
		}
		else if(consumedUnits > secondLimit){
//			charges of with in first limit is added
			charge += firstLimit*5;
//			charges of with in second limit is added
			charge += (secondLimit-firstLimit)*10;
//			charges of beyond second limit is added
			charge += (consumedUnits-secondLimit)*20;
		}
		
//		Calculating total water bill
		totalWaterBill = meterCharge+charge;
		
//		Output
		System.out.println("Total Water bill of "+consumedUnits+" units is "+totalWaterBill);
	}

}
