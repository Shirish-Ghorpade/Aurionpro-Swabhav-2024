package com.aurionpro.selection.test;
import java.util.Scanner;
public class CelciusConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        double result=0;
        switch (choice) {
			case 1:
				result = (temperature * 9/5) + 32;
				System.out.println(temperature+"C is equal to "+result+"F");
				break;
			case 2:
				result = (temperature - 32) * 5/9;
				System.out.println(temperature+"F is equal to "+result+"C");
				break;
			case 3:
				result = temperature + 273.15;
				System.out.println(temperature+"C is equal to "+result+"K");
				break;
			case 4:
				result = temperature - 273.15;
				System.out.println(temperature+"K is equal to "+result+"C");
				break;
			case 5:
				result = (temperature - 32) * 5/9 + 273.15;
				System.out.println(temperature+"F is equal to "+result+"K");
				break;
			case 6:
				result = (temperature- 273.15) * 9 / 5 + 32;
				System.out.println(temperature+"K is equal to "+result+"F");
				break;
			default:
				System.out.println("Please enter the valid number");
		}

	}

}
