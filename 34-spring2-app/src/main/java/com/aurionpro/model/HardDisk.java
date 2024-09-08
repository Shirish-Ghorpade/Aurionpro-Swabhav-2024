package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HardDisk {
//	private int capacity;
	@Value("10")
	private int capacity;
	public HardDisk() {

	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public HardDisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + "]";
	}

}
