package com.aurionpro.model;

public class AreaCalculator {
	double calculateAreaOfCircle(int radius) {
		return 3.14*radius*radius;
	}
	
	double calculateAreaOfRectangle(int length, int breath) {
		return length*breath;
	}
	
	double calculateAreaOfTriangle(int height, int base) {
		return (height*base)/2;
	}
	
}
