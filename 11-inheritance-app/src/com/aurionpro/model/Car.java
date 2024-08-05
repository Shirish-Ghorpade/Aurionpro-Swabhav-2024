package com.aurionpro.model;

public class Car extends FourWheeler{
	private double price;

	public Car(String carName, int mileage, double price) {
		super(carName, mileage);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", mileage=" + mileage + ", companyName=" + companyName + ", getPrice()="
				+ getPrice() + ", getMileage()=" + getMileage() + ", getCompanyName()=" + getCompanyName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
