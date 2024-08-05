package com.aurionpro.behaviour.command.test;

import com.aurionpro.behaviour.command.model.AirConditioner;
import com.aurionpro.behaviour.command.model.RemoteControl;
import com.aurionpro.behaviour.command.model.TurnOffCommand;
import com.aurionpro.behaviour.command.model.TurnOnCommand;

public class Test {
	
//	Lack of abstraction
//	undo and redo functionality
//	difficulty in code maintenance
	
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		AirConditioner airConditioner = new AirConditioner(false, 15);
		
		remoteControl.setCommand(new TurnOnCommand(airConditioner));
		remoteControl.pressButton();
		remoteControl.setCommand(new TurnOffCommand(airConditioner));
		remoteControl.pressButton();
	}

}
