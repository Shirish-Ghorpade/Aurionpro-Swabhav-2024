package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.ICar;
import com.aurionpro.creational.abstractfactory.model.ICarFactory;
import com.aurionpro.creational.abstractfactory.model.MarutiFactory;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICarFactory marutiFactory = new MarutiFactory();
		ICar maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
	}
}
