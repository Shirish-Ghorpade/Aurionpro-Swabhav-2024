package com.aurionpro.solution.test;

import com.aurionpro.solution.model.DiwaliInterest;
import com.aurionpro.solution.model.FixedDeposit;
import com.aurionpro.solution.model.HoliInterest;

public class FDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fixedDeposit = new FixedDeposit(100, "Shirish", 1000.0, 5, new DiwaliInterest());
		System.out.println(fixedDeposit);
		FixedDeposit fixedDeposit1 = new FixedDeposit(100, "Shirish", 1000.0, 5, new HoliInterest());
		System.out.println(fixedDeposit1);
		
	}

}
