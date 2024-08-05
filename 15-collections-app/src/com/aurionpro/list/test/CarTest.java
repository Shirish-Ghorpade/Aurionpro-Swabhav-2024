package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of cars");
		int n=scanner.nextInt();
		
		List<Car> cars = new ArrayList<Car>();
		
		takingInputFromUser(scanner, cars);
		
		
		for(Car car : cars) {
			System.out.println(car);
		}
		
		double max = maximumMilage(cars);
		for(Car car : cars) {
			if(car.getMilage()==max) {
				System.out.println(car.getCompanyName());
				System.out.println(car.getPrice());
				System.out.println(car.getMilage());
			}
		}
	}
	private static double maximumMilage(List<Car> cars) 
	{
		double max=0;
		for(int i=0; i<cars.size(); i++) {
			max = Math.max(max, cars.get(i).getMilage());
		}
		return max;
		
	}
	private static void takingInputFromUser(Scanner scanner, List<Car> cars) {
		for(int i=0; i<cars.size(); i++) {
			scanner.nextLine();
			System.out.println("Enter the company name of car");
			String companyName = scanner.nextLine();
			System.out.println("Enter the price");
			double price = scanner.nextDouble();
			System.out.println("Enter the mileage");
			double milage = scanner.nextDouble();
			
			cars.add(new Car(companyName, price, milage));
		}
	}

}
