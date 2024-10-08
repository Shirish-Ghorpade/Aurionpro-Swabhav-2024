package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "Jyesh", "Nimesh", "Mark", "Mahesh", "Ramesh", "ABC" };

		List<String> namesList = Arrays.asList(names);
		// System.out.println(namesList);

		System.out.println("First 3 students in ascending order");
		List<String> SortedNames = namesList.stream()
											.sorted().limit(3).collect(Collectors.toList());
		SortedNames.forEach((name) -> System.out.println(name));

		System.out.println("First 3 students in ascending order if it contains a");
		List<String> sortedNamesContainsA = namesList.stream().filter((name) -> name.contains("a")).sorted().limit(3)
				.collect(Collectors.toList());
		sortedNamesContainsA.forEach((name) -> System.out.println(name));

		System.out.println("students in descending order");
		List<String> reverseSortedNames = namesList.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		reverseSortedNames.forEach((name) -> System.out.println(name));

		System.out.println("students first 3 characters");
		List<String> first3Characters = namesList.stream().filter((name) -> name.length() >= 3)
				.map((name) -> name.substring(0, 3)).collect(Collectors.toList());
		first3Characters.forEach((name) -> System.out.println(name));

		System.out.println("students less than or equal 4 characters");
		List<String> namesOfLessThan4Charcters = namesList.stream().filter((name) -> name.length() <= 4)
				.collect(Collectors.toList());
		namesOfLessThan4Charcters.forEach((name) -> System.out.println(name));

	}
}
