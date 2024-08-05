package com.aurionpro.behaviour.command.model;

public class AirConditioner {
	private boolean isOn;
	private int temperature;
	public AirConditioner(boolean isOn, int temperature) {
		super();
		this.isOn = isOn;
		this.temperature = temperature;
	}
	public void turnOn() {
		isOn=true;
		System.out.println("Ac is turn on");
	}
	public void turnOff() {
		isOn=false;
		System.out.println("Ac is turn off");
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		System.out.println("Temperature is changed to : "+temperature);
	}
}
