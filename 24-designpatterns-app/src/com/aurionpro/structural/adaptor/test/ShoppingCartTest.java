package com.aurionpro.structural.adaptor.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structural.adaptor.model.Biscuit;
import com.aurionpro.structural.adaptor.model.Chocolate;
import com.aurionpro.structural.adaptor.model.Hat;
import com.aurionpro.structural.adaptor.model.HatAdaptor;
import com.aurionpro.structural.adaptor.model.IItem;
import com.aurionpro.structural.adaptor.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<IItem> items = new ArrayList<IItem>();
		items.add(new Biscuit("Parle", 10));
		items.add(new Chocolate("cadbury", 20));
		Hat hat = new Hat("a", "abc", 1000, 5);
		items.add(new HatAdaptor(hat));

		ShoppingCart shoppingCart = new ShoppingCart(items);
		shoppingCart.addItemstoCart(items);
		shoppingCart.displayCart();

	}

}
