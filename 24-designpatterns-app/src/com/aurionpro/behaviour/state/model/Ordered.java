package com.aurionpro.behaviour.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setiPacketObj(new Received());
		System.out.println("Moved to Received state");
		// TODO Auto-generated method stub
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("Ordered is first state");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet present in ordered state");
	}
	
}
