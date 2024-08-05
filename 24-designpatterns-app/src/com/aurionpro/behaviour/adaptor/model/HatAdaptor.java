package com.aurionpro.behaviour.adaptor.model;

public class HatAdaptor implements IItem{
	Hat hat;

	public HatAdaptor(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getLongName()+hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBasePrice()*hat.getTax()/100;
	}
	
	

}
