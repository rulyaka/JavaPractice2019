package ClasswithVasya;

import java.util.Arrays;

public class SuperHero {
	public String[] superheroes = { "Superman", "Iron man", "Wonder woman", "Hulk", "Thor", "Hellboy", "Flash",
			"Captain AMerica", "Ant Man", "Aquaman" };
	public static void main(String[] args) {
		String[] arr1 = { "wefeqfwef" }; // ONE WAY OF DECLARATION OF STRING

		// SIZE OF ARRAY == 1! ONLY ONE ELEMENT!
		String[] arr2 = new String[1]; // SECOND WAY OF DECLARATION OF ARRAY
		arr2[0] = "word";

		String[] arr3 = new String[] { "Kiwi", "Strawberry" }; // Third WAY OF DECLARATION OF ARRAY

		System.out.println(Arrays.toString(arr2));

		

		// how many supe heroes we have with the space with in the name
		// Print all of them and their count
		int count = 0;
		String listOfHeroesWithSpace = "";
		for (String n : superheroes) {
			if (n.contains(" ")) {

				System.out.println(n);

				listOfHeroesWithSpace = listOfHeroesWithSpace + n + ", ";
				count++;
			}

		}
		System.out.println("Super heroes with coma: " + count);

		System.out.println(listOfHeroesWithSpace.substring(0, listOfHeroesWithSpace.length() - 2));
		String[] newHeroes = listOfHeroesWithSpace.split(", ");
		System.out.println(Arrays.toString(newHeroes));

	}
}
