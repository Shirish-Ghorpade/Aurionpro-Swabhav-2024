package com.aurionpro.behaviour.command.model;

public class RemoteControl {
	ICommand command;

	public RemoteControl() {

	}

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}
