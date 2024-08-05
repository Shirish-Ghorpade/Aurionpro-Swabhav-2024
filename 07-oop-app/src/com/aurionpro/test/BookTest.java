package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bookId=0;
		String name=null;
		String author=null;
		double price=0.0;
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of books ");
		int n = scanner.nextInt();
		Book books[] = new Book[n];
		
		
		System.out.println("Enter the details of the players");
		for(int i=0; i<books.length; i++) {
			System.out.println("----------------------------------------------------------------");
			
			Boolean inCorrectValue=true;
			
			System.out.println("Enter Book Id");
			while(inCorrectValue) {
				bookId = scanner.nextInt();
				if(bookId>0) {
					inCorrectValue=false;
				}
				else {
					System.out.println("Id should be positive");
				}
			}
			scanner.nextLine();
			inCorrectValue=true;
			System.out.println("Enter name of the book");
			while(inCorrectValue) {
				name = scanner.nextLine();
				if(name.charAt(0) != ' ') {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid name");
				}
			}
			System.out.println("Enter the name of author");
			inCorrectValue=true;
			while(inCorrectValue) {
				author = scanner.nextLine();
				if(author.charAt(0) != ' ') {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid name");
				}
			}
			

			System.out.println("Enter price of the book");
			inCorrectValue=true;
			while(inCorrectValue) {
				price = scanner.nextDouble();
				if(price>=0) {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid number");
				}
			}
			books[i] = new Book(bookId, name, author, price);
		}

		System.out.println("Before Sorting");
		
		System.out.println("----------------------------------");
		for(int i=0; i<books.length; i++) {
			books[i].displayPlayers();
		}
		
		Arrays.sort(books);
		
		System.out.println("------------------------------------------");
		System.out.println("After Sorting");

		for(int i=0; i<books.length; i++) {
			books[i].displayPlayers();
		}
	
	}

}
