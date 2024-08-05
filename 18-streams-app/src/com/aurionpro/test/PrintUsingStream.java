package com.aurionpro.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PrintUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Stream<String>stream = Files.lines(Paths.get("D:\\Aurionpro_Training\\18-streams-app\\src\\com\\aurionpro\\test\\test"))){
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
