package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.Directory;
import com.aurionpro.structural.composite.model.File;
import com.aurionpro.structural.composite.model.FileSystem;

public class Test {
//	Composite design pattern means object inside the object
	public static void main(String[] args) {
		Directory movies = new Directory("Movies");
		FileSystem movie1 = new File("movie1");
		movies.add(movie1);
		
		
		Directory watchedMovies = new Directory("WatchedMovies");
		FileSystem movie2 = new File("movie2");
		watchedMovies.add(movie2);
		movies.add(watchedMovies);
		
//		movies.ls();
		watchedMovies.ls();
	}
}
