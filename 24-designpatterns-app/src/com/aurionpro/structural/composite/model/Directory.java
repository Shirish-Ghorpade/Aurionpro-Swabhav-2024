package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	
	private String directoryName;
//	arrays stores the data type of interface so, we can store the File or Directory.
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
//		if it contains the File or Directory then we can print it directly
		for(FileSystem fileSystem : fileSystemsList) {
			fileSystem.ls();
		}
	}
}
