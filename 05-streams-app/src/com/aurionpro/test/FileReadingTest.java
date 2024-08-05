package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_Training\\05-streams-app\\src\\com\\aurionpro\\test\\test1");
			int ch;
			int characters = 0;
			int words=0;
			int lines=0;
//			Find word using this two flags
			boolean prevSpace=true, newLine=true;
			
			while((ch=fileInputStream.read()) != -1) {	
				System.out.print((char)ch);
				
//				Encountered a character
				if(Character.isLetter(ch)) {
					characters++;
//					
//					It is first character after the space
//					This is starting word of new line 
//				    then it is a word	
					if(prevSpace==true || newLine==true) {
						words++;
//						set both of them as false
						prevSpace=false;
						newLine=false;
					}
				}
//				new line exist
				else if(ch=='\n'){
					newLine=true;
					lines++;
				}
//				If we encounter space
				else if(Character.isWhitespace(ch) && !prevSpace){
					prevSpace=true;
				}
			}
//			Last line do not contain '/n' so we consider last line separately
			lines++;
			System.out.println();
			System.out.println("The above content contains "+characters+" characters "+words+" words "+lines+" lines");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
