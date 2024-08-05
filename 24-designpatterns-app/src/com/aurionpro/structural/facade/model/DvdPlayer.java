package com.aurionpro.structural.facade.model;

public class DvdPlayer implements TurnOn{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Dvd player is turned on");
	}
	
	void setMovie(String movie) {
		System.out.println(movie);
	}
	
}
