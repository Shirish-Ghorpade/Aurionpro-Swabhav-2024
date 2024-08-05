package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintUsingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader;
		try {
			fileReader = new FileReader("D:\\Aurionpro_Training\\18-streams-app\\src\\com\\aurionpro\\test\\test");

			int ch;
			StringBuilder sb = new StringBuilder();
			try {
				while ((ch = fileReader.read()) != -1) {
					if (ch == '\n') {
						System.out.println(sb.toString());
						sb.setLength(0);
					}else {
						sb.append((char)ch);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(sb.length() > 0) {
				System.out.println(sb.toString());
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
