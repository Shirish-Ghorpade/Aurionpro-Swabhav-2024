package com.aurionpro.structural.composite.model;

public class File implements FileSystem {
	private String fileName;

	public File(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("File name : " + fileName);
	}

}
