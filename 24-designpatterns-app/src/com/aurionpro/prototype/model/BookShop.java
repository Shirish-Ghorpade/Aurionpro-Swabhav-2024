package com.aurionpro.prototype.model;

import java.util.ArrayList;
import java.util.List;


// clone method is protected method of object class so we need to implement Cloneable interface 
public class BookShop implements Cloneable{
	private String shopName;
	List<Book> books = new ArrayList<>();

	public BookShop() {

	}

	public BookShop(String shopName, List<Book> books) {
		super();
		this.shopName = shopName;
		this.books = books;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void loadData() {

		for (int i = 1; i <= 10; i++) {
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book "+i);
			getBooks().add(b);
		}

	}
	
	
//	It is gives shallow copy
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
//	Ut is gives deep copy
	@Override
	public BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 BookShop shop = new BookShop();
		 for(Book book : this.getBooks()) {
			 shop.getBooks().add(book);
		 }
		 return shop;
	}

	
	
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

}
