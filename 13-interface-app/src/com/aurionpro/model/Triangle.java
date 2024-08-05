package com.aurionpro.model;

public class Triangle implements Shape{
	private int height;
	private int breath;
	
	public Triangle(int height, int breath) {
		super();
		this.height = height;
		this.breath = breath;
	}

	public void area() {
		System.out.println("Area is "+(height*breath)/2);
	}
}
