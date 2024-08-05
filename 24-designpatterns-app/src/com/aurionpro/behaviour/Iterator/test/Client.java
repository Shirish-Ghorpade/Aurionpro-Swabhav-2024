package com.aurionpro.behaviour.Iterator.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.behaviour.Iterator.model.Book;
import com.aurionpro.behaviour.Iterator.model.Iterator;
import com.aurionpro.behaviour.Iterator.model.Library;


public class Client {
	public static void main(String[] args) {
		List<Book> booksList =Arrays.asList( new Book(100, "Science"), new Book(200, "History"), new Book(300, "Maths"));
		
		Library lib = new Library(booksList);
		Iterator iterator = lib.createIterator();
		
		while(iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getBookName());
		}
	}

}
