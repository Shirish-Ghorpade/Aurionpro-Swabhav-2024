package com.aurionpro.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

////////////////////////////////////////////////////////////////////////////////////////////////
//POC ON FILE CLASS
public class FileClass {

	public static void main(String[] args) {

		/////////////// Creating File /////////////////

		// Create file object name as test3
		File file = new File("test3.txt");
		// System.out.println(file.exists()); // ---> false
		try {
			// Create physical file
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists()); // --> true

		////////////////// Display File information /////////////

		if (file.exists()) {
			System.out.println("File Location : " + file.getAbsolutePath());
			System.out.println("File Name : " + file.getName());
			// System.out.println("File Size : "+file.length()); //---> Without any data
			// size is 0
			System.out.println("File Size : " + file.length()); // How many characters present in file including space
			System.out.println("File is readable " + file.canRead());
			System.out.println("File is writable " + file.canWrite());
		} else {
			System.out.println("File does not exit");
		}

		//////////////////// Delete a file ////////////////////
		if (file.exists()) {
			file.delete();
			System.out.println("File deleted sucessfully");
		} else {
			System.out.println("File does not exit");
		}

		System.out.println("File exist : " + file.exists());
		

		//////////////////// Write into the file /////////////////
		// Using FileWriter class
		try {
			@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter("test3.txt");
			try {
				fileWriter.write("Aurionpro Swabhav");				
			}
			finally {
				fileWriter.close();
			}
			System.out.println("SucessFully data wrote in the file");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/////////////////// Read into a file //////////////////////
//		Using FileReader class
		try {
			@SuppressWarnings("resource")
			FileReader fileReader = new FileReader("test3.txt");
			try {
				int ch;
				while ((ch=fileReader.read())!=-1) {
					System.out.print((char)ch);
				}
				System.out.println();
			}
			finally {
				fileReader.close();
			}
			System.out.println("SucessFully read file data");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//////////////////// Rename the file name ///////////////////
		File previousFileName = new File("test3.txt");
		File updatedFileName = new File("test4.txt");
		
		if(previousFileName.exists()) {
			System.out.println("File name updated : " + previousFileName.renameTo(updatedFileName));
		}
		else {
			System.out.println("File does not exists ");
		}
		
	}
}
