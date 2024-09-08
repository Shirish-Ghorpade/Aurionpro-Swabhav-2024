package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Tata;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Always make reference variable of interface
		ICar car;
		car = CarFactory.makeCar("Maruti");
		car.start();
		car.stop();
		
		car = CarFactory.makeCar("Tata");
		car.start();
		car.stop();
		
		car = CarFactory.makeCar("Mahindra");
		car.start();
		car.stop();
		
	}

}
