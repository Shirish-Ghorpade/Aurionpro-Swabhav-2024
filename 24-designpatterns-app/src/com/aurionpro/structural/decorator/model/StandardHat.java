package com.aurionpro.structural.decorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Standard ";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "It is Standard Hat ";
	}

}
