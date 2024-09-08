package com.aurionpro.model;

@SuppressWarnings("serial")
public class CellAlreadyMarkedException extends RuntimeException {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Cell is already marked";
	}

}
