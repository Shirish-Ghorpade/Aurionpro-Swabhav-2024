package com.aurionpro.structural.decorator.model;

public class HatDecorator implements IHat{
	IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription();
	}
}
