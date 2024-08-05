package com.aurionpro.behaviour.command.model;

public class Unix implements FileSystemReceiver{

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("Unix open the file");
		
	}

	@Override
	public void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Unix close the file");
		
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("Unix write the file");
	}
}
