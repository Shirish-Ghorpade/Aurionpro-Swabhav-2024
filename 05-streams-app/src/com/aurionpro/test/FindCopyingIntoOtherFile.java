package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FindCopyingIntoOtherFile {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_Training\\05-streams-app\\src\\com\\aurionpro\\test\\test1");
			FileOutputStream fileOutputStream  = new FileOutputStream("D:\\Aurionpro_Training\\05-streams-app\\src\\com\\aurionpro\\test\\test2");
			int ch;
			while((ch=fileInputStream.read()) != -1) {
				
				fileOutputStream.write(ch);

			}
			System.out.println("File copied sucessfully !!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
