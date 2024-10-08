package com.aurionpro.behaviour.Iterator.model;

import java.util.List;

public class Library implements Aggregate{
	private List<Book> bookList;

	public Library(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new BookIterator(bookList);

	}

}
