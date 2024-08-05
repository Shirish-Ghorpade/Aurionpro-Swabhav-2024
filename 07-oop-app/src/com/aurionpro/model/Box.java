package com.aurionpro.model;

public class Box {
	private int height;
	private int width;	
	private int depth;
	
	public Box() {
		this.height = 10;
		this.width=20;
		this.depth=30;
	}
	
	public Box(int h, int w, int d) {
		this.height = h;
		this.width = w;
		this.depth = d;
	}
	
	public void setHeight(int h) {
		height=h;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int w) {
		width=w;
	}
	public int getWidth() {
		return width;
	}
	public void setDepth(int d) {
		depth=d;
	}
	public int getDepth() {
		return depth;
	}
}
