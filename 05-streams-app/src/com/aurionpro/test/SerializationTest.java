package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	void learning() {
		System.out.println("Learning !!!!!!");
	}
}
public class SerializationTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id=11;
		employee.name = "Xyz Wer";
//		Store absolute path in file variable
		String fileName = "D:\\Aurionpro_Training\\05-streams-app\\src\\com\\aurionpro\\test\\test5";
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			
			try {
				@SuppressWarnings("resource")
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(employee);
				
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
