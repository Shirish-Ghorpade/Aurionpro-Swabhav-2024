package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String[] args) {
		String fileName = "D:\\Aurionpro_Training\\05-streams-app\\src\\com\\aurionpro\\test\\test5";

		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			try {
				@SuppressWarnings("resource")
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				try {
					Employee obj = (Employee) objectInputStream.readObject();
					System.out.println(obj.id);
					System.out.println(obj.name);
					obj.learning();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
