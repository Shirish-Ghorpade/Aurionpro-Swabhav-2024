package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int employeeId;
		String name;
		int salary;

		/////////////////////////// Object 1///////////////////////////

		System.out.println("Enter the number of empployees");
		int n = scanner.nextInt();

		Employee employees[] = new Employee[n];

		for (int i = 0; i < n; i++) {
			// Enter the details of employees
			System.out.println("Enter the employee ID");
			employeeId = scanner.nextInt();
			System.out.println("Enter the name");
			scanner.nextLine();
			name = scanner.nextLine();
			System.out.println("Enter the salary");
			salary = scanner.nextInt();

			employees[i] = new Employee(employeeId, name, salary);
		}

		for (int i = 0; i < n; i++) {

			// Getting values from attribute
			System.out.println("Employee ID is " + employees[i].getEmployeeId());
			System.out.println("Name of the employee is " + employees[i].getName());
			System.out.println("Salary of the employee is " + employees[i].getSalary());
		}

//		///////////////////////// Object 2///////////////////////////
//
//		System.out.println("Enter the employee ID");
//		employeeId = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Enter the name");
//		name = scanner.nextLine();
//		System.out.println("Enter the salary");
//		salary = scanner.nextInt();
//
//		Employee employee2 = new Employee(employeeId, name, salary);
//
//		System.out.println("Employee ID is " + employee2.getEmployeeId());
//		System.out.println("Name of the employee is " + employee2.getName());
//		System.out.println("Salary of the employee is " + employee2.getSalary());
	}

}
