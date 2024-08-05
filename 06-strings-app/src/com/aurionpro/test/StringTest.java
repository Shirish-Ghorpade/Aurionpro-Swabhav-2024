package com.aurionpro.test;

public class StringTest {

	public static void main(String[] args) {
		
		
/////////////////////////		String pool concept
//		 String name1 = "devan";
//		 String name2 = "devan";
//		 
//		 System.out.println(name1.hashCode());
//		 System.out.println(name2.hashCode());
//		 
//		 System.out.println(name1==name2);
//		 
//		 String name3 = new String("Vinayak");
//		 String name4 = new String("Vinayak2");
//		 
//		 System.out.println(name3.hashCode());
//		 System.out.println(name4.hashCode());
//		 
//		 System.out.println(name3==name4);
		 
		 
		
		/////////////////////////// String are immutable /////////////////////
//		String name1 = "swapnil";
//		System.out.println(name1.hashCode());
//		name1 += "kulkarni";
//		System.out.println(name1.hashCode());
//		System.out.println(name1);
		
		
		
//		Jar file ---> Java archiver file
		StringBuilder name1 = new StringBuilder("swapnil");
		System.out.println(name1.hashCode());
		name1.append("kulkarni");
		System.out.println(name1.hashCode());
		System.out.println(name1);
		
		
//		
		
	}

}
