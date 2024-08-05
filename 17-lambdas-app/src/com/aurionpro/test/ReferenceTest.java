package com.aurionpro.test;

import com.aurionpro.model.ITest;
import com.aurionpro.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {

//		ITest test = Reference::new;
		ITest test = ()-> new Reference();
		method(test);

//		ITest test2 = Reference::staticPrint;
		ITest test2 = ()-> Reference.staticPrint();
		method(test2);

//		Reference obj = new Reference();
//		ITest test3 = obj::print;
		
		Reference obj = new Reference();
		ITest test3 = ()-> obj.print();
		method(test3);
	}
	private static void method(ITest test) {
		test.display();
	}
}
