package com.aurionpro.test;

import java.util.function.Consumer;

public class ConsumerFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = (Integer number) -> {
			int ans = 1;
			for (int i = 2; i <= number; i++) {
				ans *= i;
			}
			System.out.println(ans);
		};
		
		consumer.accept(10);
	}

}
