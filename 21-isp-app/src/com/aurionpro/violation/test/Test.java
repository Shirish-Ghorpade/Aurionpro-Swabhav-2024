package com.aurionpro.violation.test;

import com.aurionpro.violation.model.Labour;
import com.aurionpro.violation.model.Robot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labour labour = new Labour();
		Robot robot = new Robot();
		
		labour.eat();
		labour.drink();
		labour.stopWork();
		labour.startWork();
		
		robot.eat();
		robot.drink();
		robot.startWork();
		robot.stopWork();

	}

}
