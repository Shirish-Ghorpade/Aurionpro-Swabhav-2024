package com.aurionpro.test;

import com.aurionpro.model.TrafficLight;

public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight light = TrafficLight.RED;
		printTrafficLightAction(light);
		
		light = TrafficLight.YELLOW;
		printTrafficLightAction(light);
		
		light = TrafficLight.GREEN;
		printTrafficLightAction(light);

	}
	public static void printTrafficLightAction(TrafficLight light) {
		switch (light) {
			case RED:
				System.out.println("STOP");
				break;
			case YELLOW:
				System.out.println("Caution");
				break;
			case GREEN:
				System.out.println("Go");
				break;
		}
	}

}
