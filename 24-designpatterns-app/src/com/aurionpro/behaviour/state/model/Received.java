package com.aurionpro.behaviour.state.model;

public class Received implements IPacketState{
	
	
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setiPacketObj(new Delivered());
		System.out.println("Packet is moved to the delievered state");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setiPacketObj(new Ordered());
		System.out.println("Packet is moved to the ordered state");
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet present in received state");
		
	}

}
