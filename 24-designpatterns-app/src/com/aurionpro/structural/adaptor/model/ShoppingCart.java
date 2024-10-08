package com.aurionpro.structural.adaptor.model;

import java.util.List;

public class ShoppingCart {

	List<IItem> items;

	public ShoppingCart(List<IItem> items) {
		super();
		this.items = items;
	}

	public List<IItem> getItems() {
		return items;
	}

	public void setItems(List<IItem> items) {
		this.items = items;
	}

	public void addItemstoCart(List<IItem> items) {
		setItems(items);
	}

	public void getCartItems() {
		for(IItem item : items) {
			System.out.println(item.getItemName());
		}
	}

	public void getCartPrice() {
		for(IItem item : items) {
			System.out.println(item.getItemPrice());
		}
	}

	public void displayCart() {
		System.out.println("Name\tPrice");
		for(IItem item : items) {
			System.out.print(item.getItemName() + "\t"+ item.getItemPrice());
			System.out.println();
		}
		total(items);
	}
	
	public static void total(List<IItem> items) {
//		int sum=0;
//		for(IItem item : items) {
//			sum += item.getItemPrice();
//		}
//		System.out.println("Total\t"+sum);
		
		System.out.println("Total\t"+items.stream().map((item)->item.getItemPrice()).reduce((double) 0, (price1, price2)-> price1+price2));
	}

}
