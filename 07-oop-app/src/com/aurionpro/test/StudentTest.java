package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollNumber;
		String name;
		int age;
		double percentage;
		
		Scanner scanner =  new Scanner(System.in);
		rollNumber = scanner.nextInt();
		name = scanner.next();
		age = scanner.nextInt();
		percentage = scanner.nextDouble();
		
		
		
		Student s1 = new Student();

		
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getPercentage());
		
		
		
		rollNumber = scanner.nextInt();
		name = scanner.next();
		age = scanner.nextInt();
		percentage = scanner.nextDouble();
		
		
		
		Student s2 = new Student(rollNumber, name, age, percentage);

		
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getPercentage());
		
		
	}

}
