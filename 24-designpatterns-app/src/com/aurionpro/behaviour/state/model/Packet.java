package com.aurionpro.behaviour.state.model;

public class Packet {
	
	IPacketState iPacketObj;
	public Packet(IPacketState iPacketObj) {
		// TODO Auto-generated constructor stub
		this.iPacketObj=iPacketObj;
	}
	

	public IPacketState getiPacketObj() {
		return iPacketObj;
	}

	public void setiPacketObj(IPacketState iPacketObj) {
		this.iPacketObj = iPacketObj;
	}
	
	public void nextState() {
		iPacketObj.next(this);
	}
	
	public void previousState() {
		iPacketObj.previous(this);
		
	}
	public void printStatus() {
		iPacketObj.current(this);
	}
}
