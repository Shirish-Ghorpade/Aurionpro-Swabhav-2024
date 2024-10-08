package com.aurionpro.behaviour.state.test;

import com.aurionpro.behaviour.state.model.Ordered;
import com.aurionpro.behaviour.state.model.Packet;

public class Test {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());
		packet.printStatus();

		packet.nextState();
		packet.printStatus();
		packet.nextState();
		packet.printStatus();

		packet.previousState();
		packet.printStatus();
		packet.previousState();
		packet.printStatus();
		packet.previousState();
		packet.printStatus();
		packet.previousState();
		packet.printStatus();

	}

}
