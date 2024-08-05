package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.AreaOfReactangle;

public class AreaOfReactangleTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int height;
		int width;

		AreaOfReactangle areaOfReactangle = new AreaOfReactangle();		
		
		System.out.println("Enter the height 1");
		height = scanner.nextInt();
		System.out.println("Enter the width 1");
		width = scanner.nextInt();
		
		
		System.out.println("Height is "+areaOfReactangle.getHeight());
		System.out.println("Width is "+areaOfReactangle.getWidth());
		System.out.println("Area of rectangle is "+areaOfReactangle.area());
		
		
		System.out.println("Enter the height 2");
		height = scanner.nextInt();
		System.out.println("Enter the width 2");
		width = scanner.nextInt();
		
		AreaOfReactangle areaOfReactangle2 = new AreaOfReactangle(height, width);
		
		System.out.println("Height is "+areaOfReactangle2.getHeight());
		System.out.println("Width is "+areaOfReactangle2.getWidth());
		System.out.println("Area of rectangle is "+areaOfReactangle2.area());
	
	}
}
