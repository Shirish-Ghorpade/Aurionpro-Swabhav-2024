package com.aurionpro.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("config.class");
		
	}
}
