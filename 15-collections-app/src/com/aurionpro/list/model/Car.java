package com.aurionpro.list.model;

public class Car {
	private String companyName;
	private double price;
	private double milage;
	public Car(String companyName, double price, double milage) {
		super();
		this.companyName = companyName;
		this.price = price;
		this.milage = milage;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", price=" + price + ", milage=" + milage + "]";
	}
	
	
	
}
