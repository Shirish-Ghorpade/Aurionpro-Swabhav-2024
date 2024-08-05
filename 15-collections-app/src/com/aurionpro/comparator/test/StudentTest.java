package com.aurionpro.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.comparator.model.Student;
import com.aurionpro.comparator.model.StudentComparator;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(4, "Sayali", 85.90));
		students.add(new Student(2, "Namrata", 89.90));
		students.add(new Student(3, "Aagya", 90));
		students.add(new Student(1, "Neha", 84.90));
		System.out.println("before sort");
		for(Student student : students) {
			System.out.println(student);
		}
		
		Collections.sort(students, new StudentComparator.StudentRollNumberComparator());
		System.out.println("After sort roll number wise");
		for(Student student : students) {
			System.out.println(student);
		}
		
		
		Collections.sort(students, new StudentComparator.StudentNameComparator());
		System.out.println("After sort name wise");
		for(Student student : students) {
			System.out.println(student);
		}
		
		Collections.sort(students, new StudentComparator.StudentPercentageComparator());
		System.out.println("After sort percentage wise");
		for(Student student : students) {
			System.out.println(student);
		}
		
//		for(int i=0; i<n; i++) {
//			System.out.println("Enter the roll numeber");
//			int rollNo = scanner.nextInt();
//			scanner.nextLine();
//			System.out.println("Enter the name");
//			String name = scanner.nextLine();
//			System.out.println("Enter the percentage");
//			double percentage = scanner.nextDouble();
//			
//			Students.add(new Student(rollNo, name, percentage));
//		}

	}

}
