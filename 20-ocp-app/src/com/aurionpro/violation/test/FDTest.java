package com.aurionpro.violation.test;

import com.aurionpro.violation.model.FestivalType;
import com.aurionpro.violation.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fixedDeposit = new FixedDeposit(100, "Shirish", 1000, 1, FestivalType.DIWALI);
		FixedDeposit fixedDeposit1 = new FixedDeposit(100, "Shirish", 1000, 5, FestivalType.HOLI);

		System.out.println(fixedDeposit);
		System.out.println(fixedDeposit1);

	}

}

// OCP : Open for extension and close for modification
//In the above example if we want to add new festival then we need to modify our previous program
//It is violation of OCP
