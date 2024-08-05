package com.aurionpro.model;

public class AreaOfReactangle {

	private int height;
	private int width;
	
	public AreaOfReactangle() {
		this.height=10;
		this.width=20;
	}
	public AreaOfReactangle(int h, int w) {
		this.height=h;
		this.width=w;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}
	public int area() {
		return this.height*this.width; 
	}
	
}
