package com.aurionpro.solution.model;


public class FileLogger implements ILogger{
	public void log(String err) {
		System.out.println(err);
	}
}
