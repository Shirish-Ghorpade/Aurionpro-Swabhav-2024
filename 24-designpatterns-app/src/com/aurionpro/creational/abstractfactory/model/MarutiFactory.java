package com.aurionpro.creational.abstractfactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new Maruti();
	}
	
}
