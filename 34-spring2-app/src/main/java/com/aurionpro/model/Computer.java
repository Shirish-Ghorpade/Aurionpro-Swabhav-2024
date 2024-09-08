package com.aurionpro.model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Computer {
	private HardDisk hardisk;
	private String name;

	public Computer(HardDisk hardisk, String name) {
		super();
		this.hardisk = hardisk;
		this.name = name;
	}

	public HardDisk getHardisk() {
		return hardisk;
	}

	public void setHardisk(HardDisk hardisk) {
		this.hardisk = hardisk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Computer [hardisk=" + hardisk + ", name=" + name + ", getHardisk()=" + getHardisk() + ", getName()="
				+ getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
