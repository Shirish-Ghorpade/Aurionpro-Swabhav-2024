package com.aurionpro.model;

public class FourWheeler extends Vehicle{
	int mileage;
	

	public FourWheeler(String companyName, int mileage) {
		super(companyName);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "FourWheeler [mileage=" + mileage + ", companyName=" + companyName + ", getMileage()=" + getMileage()
				+ ", getCompanyName()=" + getCompanyName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
