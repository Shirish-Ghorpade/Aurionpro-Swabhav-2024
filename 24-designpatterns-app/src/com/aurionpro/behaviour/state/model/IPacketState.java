package com.aurionpro.behaviour.state.model;

public interface IPacketState {
	
	public void next(Packet packet);
	public void previous(Packet packet);
	public void current(Packet packet);

}
