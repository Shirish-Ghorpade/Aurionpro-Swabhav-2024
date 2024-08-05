package com.aurionpro.behaviour.command.model;

public class TurnOnCommand implements ICommand{
	AirConditioner ac;
	

	public TurnOnCommand(AirConditioner ac) {
		super();
		this.ac = ac;
	}

	

	public AirConditioner getAc() {
		return ac;
	}

	public void setAc(AirConditioner ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.turnOn();
	}
	

}
