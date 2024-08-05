package com.aurionpro.creational.factory.model;

public class CarFactory {

	static ICar car;

	public static ICar makeCar(String carName) {
		if (carName == "Maruti")
			car = new Maruti();
		if (carName == "Tata")
			car = new Tata();
		if (carName == "Mahindra")
			car = new Mahindra();

		return car;
	}
}
