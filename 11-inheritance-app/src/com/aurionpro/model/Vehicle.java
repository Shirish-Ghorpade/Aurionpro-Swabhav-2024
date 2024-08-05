package com.aurionpro.model;

public class Vehicle {
	String companyName;

	public Vehicle(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Vehicle [companyName=" + companyName + ", getCompanyName()=" + getCompanyName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
