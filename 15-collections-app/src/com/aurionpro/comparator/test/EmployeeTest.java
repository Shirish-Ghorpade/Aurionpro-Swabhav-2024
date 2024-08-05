package com.aurionpro.comparator.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.comparator.model.Employee;
import com.aurionpro.comparator.model.EmployeeComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Shirish", 1000000));
		employees.add(new Employee(4, "Sarvesh", 130000));
		employees.add(new Employee(3, "Chirag", 7000000));

		System.out.println("Before sort");

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("Sort by id");

		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("Sort by name");

		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("Sort by salary");

		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
