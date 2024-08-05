package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(25);
		circle.area();
		
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.area();
		
		Triangle triangle= new Triangle(10, 20);
		triangle.area();

	}

}
