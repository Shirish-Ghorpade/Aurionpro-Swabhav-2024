package com.aurionpro.behaviour.command.model;

public class TurnOffCommand implements ICommand{
	
	AirConditioner ac;
	
	public TurnOffCommand(AirConditioner ac) {
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
		ac.turnOff();
	}
	
}
