package com.aurionpro.structural.decorator.model;

public class CarServiceDecorator implements ICarService {

	private ICarService carObj = null;

	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return carObj.getCost();
	}

}
