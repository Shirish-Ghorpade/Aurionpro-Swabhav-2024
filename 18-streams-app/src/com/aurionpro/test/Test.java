package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		
//		Method 1
//		Stores numbers in the stream data type and then apply forEach loop to that data type
		Stream<Integer> streamOfNumber = numbers.stream();
		streamOfNumber.forEach((number) -> System.out.println(number));

//		Method 2
//		Directly apply forEach loop to the stream array
		numbers.stream().forEach((number) -> System.out.println(number));

//		filter is used to filter is used to filter the elements
//		collect is used to collect the element into the list 
//		So whenever we used the collect method then store the values in the list 
//		so, here we store elements in the listOfFilteredNumbers 
		List<Integer> listOfFilteredNumbers = numbers.stream().filter((number) -> number % 2 != 0)
				.filter((number) -> number > 25).collect(Collectors.toList());

		listOfFilteredNumbers.stream().forEach((number) -> System.out.println(number));

		List<Integer> squaredNumbers = numbers.stream().map((number) -> number * number).collect(Collectors.toList());

		squaredNumbers.forEach(number -> System.out.println(number));
		
		
//		Terminal operation
		
		int sum = numbers.stream().reduce(0, (number1, number2)-> number1+number2);
		System.out.println("Sum is "+sum);
		
//		Sort elements
		List<Integer>SortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		SortedNumbers.forEach((number)-> System.out.println(number));
		
//		Sort in reverse order
		List<Integer>reverseSortedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		reverseSortedNumbers.forEach((number)-> System.out.println(number));
		
		
//		limit is 3 so, 3 elements
		System.out.println("First 3 elements");
		List<Integer>reverseSorted3Numbers = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		reverseSorted3Numbers.forEach((number)-> System.out.println(number));
		
		
		Optional<Integer>minValue = numbers.stream().min((number1, number2)-> number1-number2);
		if(minValue.isPresent()) {
			System.out.println("min is "+minValue.get());
		}
	}

}
