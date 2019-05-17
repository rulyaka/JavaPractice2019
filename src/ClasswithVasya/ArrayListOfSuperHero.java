package ClasswithVasya;

import java.util.ArrayList;

// Superman", "Iron man", "Wonder woman", "Hulk", "Thor", "Hellboy", "Flash",
// "Captain AMerica", "Ant Man", "Aquaman"

public class ArrayListOfSuperHero {
	public static void main(String[] args) {
		ArrayList<String> superheroes = new ArrayList<>();

		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");

		ArrayList<String> HeroesWithTheSpace = new ArrayList<>();
		String longestname = "";
		for (String hero : HeroesWithTheSpace) { // <<<<==========checks if contains space
			if (hero.contains(" ")) {
				HeroesWithTheSpace.add(hero);

			}

			if (hero.length() > longestname.length()) {
				longestname = hero;
			}
		}
		System.out.println(HeroesWithTheSpace);

		String secondLongest = "";

		for (String hero : HeroesWithTheSpace) {
			if (hero.length() > secondLongest.length() && !secondLongest.equals(longestname)) {
				secondLongest=hero;
			}
		}
		System.out.println("Second longest: "+secondLongest);
	}
}
