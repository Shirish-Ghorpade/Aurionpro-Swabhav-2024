package com.aurionpro.structural.facade.model;

public class SoundSystem implements TurnOn{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Sound system is on");
	}
	public void setVolume(double volumeLevel) {
		System.out.println("Volume level is "+volumeLevel);
	}

}
