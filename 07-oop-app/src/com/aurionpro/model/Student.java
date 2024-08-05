package com.aurionpro.model;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private double percentage;
	
	
	public Student() {
		rollNumber=0;
		name="Dummy";
		age=0;
		percentage=0;
	}
	public Student(int rollNumber, String name, int age, double percentage) {
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getRollNumber() {
		return  this.rollNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return  this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return  this.age;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getPercentage() {
		return  this.percentage;
	}

}
