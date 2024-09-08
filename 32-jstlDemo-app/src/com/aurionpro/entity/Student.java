package com.aurionpro.entity;

public class Student {
	private int roll_no;
	private String name;
	private double percentage;
	public Student(int roll_no, String name, double percentage) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}
