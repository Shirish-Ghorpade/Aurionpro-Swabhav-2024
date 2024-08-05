package com.aurionpro.structural.decorator.model;

public class RibonedHat extends HatDecorator{

	public RibonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+" Riboned Hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50+super.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+" with riboned decoration";
	}
	
}
