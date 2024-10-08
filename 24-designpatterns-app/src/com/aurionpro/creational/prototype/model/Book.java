package com.aurionpro.creational.prototype.model;

public class Book {
//	We can copy the one object to another object when we use class
//	In this approach it is tightly coupled
//	what about the interface?
//	So, Solution is prototype design pattern ---> delegates the object duplication or cloning process to actual objects that are being closed
//	creates a new object of the class and copies all the fields of the old object to the new one. --> we have access of private fields also

	private int bookId;
	private String bookName;
	public Book() {
		
	}
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
	  
}
