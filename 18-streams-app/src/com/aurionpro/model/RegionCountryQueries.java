package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegionCountryQueries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		///////////////////////////////////////////// METHOD1/////////////////////////////////////////////////

		List<Region> regions = new ArrayList<Region>();
		regions.add(new Region(1, "Europe"));
		regions.add(new Region(2, "America"));
		regions.add(new Region(3, "Asia"));
		regions.add(new Region(4, "Middle East and Africa"));

		List<Country> countries = new ArrayList<Country>();
		countries.add(new Country("IT", "Italy", 1));
		countries.add(new Country("JP", "Japan", 3));
		countries.add(new Country("US", "United States of America", 2));
		countries.add(new Country("CA", "Canada", 2));
		countries.add(new Country("CN", "China", 3));
		countries.add(new Country("IN", "India", 3));
		countries.add(new Country("AU", "Australia", 3));
		countries.add(new Country("ZW", "Zimbabwe", 4));
		countries.add(new Country("SG", "Singapore", 3));
		countries.add(new Country("UK", "United Kingdom", 1));
		countries.add(new Country("FR", "France", 1));
		countries.add(new Country("DE", "Germany", 1));
		countries.add(new Country("ZM", "Zambia", 4));
		countries.add(new Country("EG", "Egypt", 4));
		countries.add(new Country("BR", "Brazil", 2));
		countries.add(new Country("CH", "Switzerland", 1));
		countries.add(new Country("NL", "Netherlands", 1));
		countries.add(new Country("MX", "Mexico", 2));
		countries.add(new Country("KW", "Kuwait", 4));
		countries.add(new Country("IL", "Israel", 4));
		countries.add(new Country("DK", "Denmark", 1));
		countries.add(new Country("HK", "HongKong", 3));
		countries.add(new Country("NG", "Nigeria", 4));
		countries.add(new Country("AR", "Argentina", 2));
		countries.add(new Country("BE", "Belgium", 1));

		System.out.println("Enter the country code");
		String countryCode = scanner.next();
		System.out.println("Name of country which has country code is "+countryCode+" is " +getCountryNameByCode(countryCode, countries));
		
		System.out.println("Enter the region id");
		int regionId = scanner.nextInt();
		System.out.println("Country names comes in region id" + regionId+" is "+ getCountryNameByRegionId(regionId, countries));
		
		
		System.out.println("Enter the region id");
		regionId = scanner.nextInt();
		System.out.println("Number of countries present in region id "+regionId+" is "+countOfCountriesByRegion(regionId, countries));
		
		
		
		

		////////////////////////////////////////////////////////// METHOD
		////////////////////////////////////////////////////////// 2//////////////////////////////////////////////////////////////
		// try(Stream<String>streamOfRegions =
		// Files.lines(Paths.get("D:\\Aurionpro_Training\\18-streams-app\\src\\com\\aurionpro\\model\\RegionData"))){
		// System.out.println("Enter the country code");
		// String countryCode = scanner.next();
		//
		//// get the name of country from the country code
		// streamOfRegions.filter((region)->region.get);
		//
		//
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// List<Country> countries = new ArrayList<Country>();
		//
		// try(Stream<String>streamOfCountries =
		// Files.lines(Paths.get("D:\\Aurionpro_Training\\18-streams-app\\src\\com\\aurionpro\\model\\CountryData"))){
		// System.out.println("Enter the country code");
		// String countryCode = scanner.next();
		//
		//// get the name of country from the country code
		// streamOfCountries.forEach((country)-> countries.add(new Country(country)));
		// filter((country)->country);
		//
		//
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	private static String getCountryNameByCode(String countryCode, List<Country> countries) {
		return countries.stream()
						.filter((country) -> country.getCountryCode().equals(countryCode))
						.map(Country::getCountryName)
						.findFirst()
						.orElse("Not Found");
	}
	
	private static List<String> getCountryNameByRegionId(int regionId, List<Country> countries) {
		return countries.stream()
						.filter((country) -> country.getRegionId()==regionId)
						.map(Country::getCountryName)
						.collect(Collectors.toList());
	}
	private static long countOfCountriesByRegion(int regionId, List<Country> countries) {
		return countries.stream()
				.filter((country) -> country.getRegionId()==regionId).count();
	}

}
