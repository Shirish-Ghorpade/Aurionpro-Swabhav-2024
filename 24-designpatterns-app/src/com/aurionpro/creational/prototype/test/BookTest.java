package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.BookShop;

public class BookTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bookShop = new BookShop();
		bookShop.setShopName("XYZ");
		bookShop.loadData();
		
		
//		Shallow copy
//		BookShop bookShop1 = (BookShop) bookShop.clone();
		
		
//		Deep copy
		BookShop bookShop1 = bookShop.clone();
		bookShop1.setShopName("ABC");
		bookShop1.getBooks().remove(0);
		
		System.out.println(bookShop);
		System.out.println(bookShop1);
		
	}

}
