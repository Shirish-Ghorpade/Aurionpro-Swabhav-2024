package com.aurionpro.behaviour.state.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Deliever is last state");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setiPacketObj(new Received());
		System.out.println("Moved to received state");
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Currently present in delievered state");
		
	}

}
