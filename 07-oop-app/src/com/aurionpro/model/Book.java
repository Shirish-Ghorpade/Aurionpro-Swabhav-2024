package com.aurionpro.model;

public class Book implements Comparable<Book>{
	private int bookId;
	private String name;
	private String author;
	private double price;
	public Book() {
		this.bookId = 0;
		this.name = null;
		this.author = null;
		this.price = 0.0;
	}
	public Book(int bookId, String name, String author, double price) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public int compareTo(Book o) {
		return (int) (o.price-this.price);
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayPlayers() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Book Id is "+this.bookId);
		System.out.println("Book name is "+this.name);
		System.out.println("Author name is "+this.author);
		System.out.println("Price is "+this.price);
	}
	
	
}
