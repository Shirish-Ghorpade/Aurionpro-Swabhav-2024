package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	
	private String directoryName;
	private List<FileSystem> fileSystemsList;

	public Directory(String directoryName) {
		super();
		this.directoryName = directoryName;
		this.fileSystemsList = new ArrayList<FileSystem>();
	}
	
	public void add(FileSystem fileSystemObj) {
		fileSystemsList.add(fileSystemObj);
	}

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("Directory name is : "+directoryName);
		for(FileSystem fileSystem : fileSystemsList) {
			fileSystem.ls();
		}
	}
}
