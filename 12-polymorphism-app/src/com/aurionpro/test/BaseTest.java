package com.aurionpro.test;

import com.aurionpro.model.Base;
import com.aurionpro.model.Derived1;
import com.aurionpro.model.Derived2;

public class BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base = new Base();
		Base base1 = new Derived1();
		Base base2 = new Derived2();
		
		base.display();
		base1.display();
		base2.display();

	}

}
