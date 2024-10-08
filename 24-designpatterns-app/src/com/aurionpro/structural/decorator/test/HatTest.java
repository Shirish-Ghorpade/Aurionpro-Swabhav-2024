package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.HatDecorator;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibonedHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Standard price : 100
		// Premium price : 500
		// Golden decoration Price : 100
		// Riboned decoration Price : 50

		IHat hat = new StandardHat();
		display(hat);
		GoldenHat goldenHat = new GoldenHat(hat);
		display(goldenHat);
		
		RibonedHat ribonedHat = new RibonedHat(hat);
		display(ribonedHat);
		
		RibonedHat goldenRibonedHat = new RibonedHat(goldenHat);
		display(goldenRibonedHat);
		
		GoldenHat ribonedGoldenHat = new GoldenHat(ribonedHat);
		display(ribonedGoldenHat);
		
		
		IHat hat1 = new PremiumHat();
		display(hat1);
		GoldenHat goldenHat1 = new GoldenHat(hat1);
		display(goldenHat1);
		
		RibonedHat ribonedHat1 = new RibonedHat(hat1);
		display(ribonedHat1);
		
		RibonedHat goldenRibonedHat1 = new RibonedHat(goldenHat1);
		display(goldenRibonedHat1);
		
		
	}

	private static void display(HatDecorator choosenHat) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("Hat name : " + choosenHat.getName());
		System.out.println("Hat Price : " + choosenHat.getPrice());
		System.out.println("Hat Description : " + choosenHat.getDescription());
	}
	private static void display(IHat choosenHat) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("Hat name : " + choosenHat.getName());
		System.out.println("Hat Price : " + choosenHat.getPrice());
		System.out.println("Hat Description : " + choosenHat.getDescription());
	}

}
