package com.aurionpro.structural.decorator.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 500 + super.getCost();
	}
}
