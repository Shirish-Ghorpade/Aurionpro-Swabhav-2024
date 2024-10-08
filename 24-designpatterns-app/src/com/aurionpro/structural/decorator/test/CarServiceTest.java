package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;
import com.aurionpro.structural.decorator.model.OilChange;
import com.aurionpro.structural.decorator.model.WheelAlign;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange carOil = new OilChange(car);
		WheelAlign carAlign = new WheelAlign(carOil);
		System.out.println(carAlign.getCost());
	}
}
