package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+" Golden Hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100+super.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+" with golden decoration";
	}

}
