package com.aurionpro.solution.test;

import com.aurionpro.violation.model.Labour;
import com.aurionpro.violation.model.Robot;

public class Test {
	public static void main(String[] args) {
		Labour labour = new Labour();
		Robot robot = new Robot();

		labour.eat();
		labour.drink();
		labour.stopWork();
		labour.startWork();


		robot.startWork();
		robot.stopWork();

	}
}
