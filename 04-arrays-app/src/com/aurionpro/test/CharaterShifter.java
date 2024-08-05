package com.aurionpro.test;

import java.util.Scanner;

public class CharaterShifter {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scanner.next();
	
		System.out.println("How many character should be shifted ?");
		int shift = scanner.nextInt();
		
		
		StringBuilder ansString = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			Character ch = word.charAt(i);
			if(Character.isLetter(ch)) {
				char baseForConversion = Character.isLowerCase(ch) ? 'a' : 'A';
				
				ch = (char)((ch-baseForConversion+shift+26)%26+baseForConversion);
			}
			ansString.append(ch);	
		}
		
		System.out.println(ansString);
	}

}
