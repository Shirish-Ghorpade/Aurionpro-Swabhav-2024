package com.aurionpro.model;

import com.aurionpro.model.OuterClass.InnerClass;

//Nested class

public class OuterClass {
	public class InnerClass {
		private int outerClassVariable = 10;

		public void demo() {

			// static variables and method is not allowed. but the inner class can contain the final static variables
//			public int innerClassVariable = 20;
			System.out.println("Hello1111111111111111");
			// We can directly access the private variables outer class variable in the inner class
			System.out.println(outerClassVariable);
			
		}
	}
	void demo2() {
		InnerClass innerClass = new InnerClass();
		innerClass.demo();
	}
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.demo2();
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//		innerClass.innerClassVariable= 3;
	}

}
//When we access the inner class variable then we have to create the object of
	// inner class
	
//	OuterClass.InnerClass inner = new OuterClass().new InnerClass();
//	inner.demo();



//

// Inner class having two types :
// Member class ---> If inner class is not a static class means it is member class
// static member class ---> If inner class is static then it is static member

// Inner class can access private members of the containing class
// Inner class have a private access modifier. private access modifier can be used on memebers on the class. 
//if we want to restricted the access of the class only with in the class then we can give them as private 
// If we create the inner class in outer class then that inner class is called
// as member class