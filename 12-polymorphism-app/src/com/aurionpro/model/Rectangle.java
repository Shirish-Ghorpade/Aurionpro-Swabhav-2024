package com.aurionpro.model;

public class Rectangle extends Shape{
	private int length;
	private int breath;
	
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	public void area() {
		System.out.println("Area of rectangle is "+length*breath);
	}
}
