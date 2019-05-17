package day39;

import java.util.*;

public class Cities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");
		for (String city : cities) {
			System.out.print(city + " | ");
		}
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}

		System.out.println(" ");

		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.toString().toUpperCase() + " | ");
		}
		// each cities all uppercase
		String paris = cities.get(0).toUpperCase();
		System.out.println(paris);
		cities.set(0, paris);
		System.out.println(cities.get(0));

		cities.set(1, cities.get(1).toUpperCase());

		for (int j = 0; j < cities.size(); j++) {

			String city = cities.get(j).toUpperCase();
			cities.set(j, city);

		}
		System.out.println(cities.toString());
         String longest="", shortest="";
		for (String city: cities) {
			if(city.length()>longest.length()) {
				longest=city;
			}
		}
		shortest=cities.get(0);
		for (String city: cities) {
			if(city.length()<shortest.length()) {
				shortest=city;
			}
		
		
	}
		
		System.out.println("Longest city : "+ longest);
		System.out.println(" Shortest city: "+shortest );
		
		
		List<String> citiesMoreThan6= new ArrayList<>();
		// ASSIGN ALL CITIES THAT HAVE MORE THAN 6 CHARACTERS
		
		for (String city: cities) {
			if(city.length()>6 ) {
				citiesMoreThan6.add(city);
			}
		}
		
		System.out.println(citiesMoreThan6);
}
}