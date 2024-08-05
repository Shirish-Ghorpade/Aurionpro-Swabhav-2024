package com.aurionpro.test;

import com.aurionpro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		System.out.println("Height is "+box.getHeight());
		System.out.println("Width is "+ box.getWidth());
		System.out.println("Depth is" +box.getDepth());
		
		
		
		System.out.println("Height is "+box.getHeight());
		System.out.println("Width is "+ box.getWidth());
		System.out.println("Depth is" +box.getDepth());
		
		
		
		System.out.println("BOx2");
		Box box2 = new Box(10, 20 , 30);
		box2.getHeight();
		box2.getWidth();
		box2.getDepth();
		
		System.out.println("Height is "+box2.getHeight());
		System.out.println("Width is "+ box2.getWidth());
		System.out.println("Depth is" +box2.getDepth());
	}

}
