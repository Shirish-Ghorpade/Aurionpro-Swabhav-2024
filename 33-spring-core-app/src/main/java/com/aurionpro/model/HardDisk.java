package com.aurionpro.model;

public class HardDisk {
	
	public HardDisk() {
		
	}
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	private int capacity;

	public HardDisk(int capacity) {
		super();
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + "]";
	}
	
}
