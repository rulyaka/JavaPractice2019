package day34;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red, blue"); // becomes like array
		printWords("red"); // can print one value
		printWords(); // can print empty
		String[] myPets = {"cat, ship","goat"};
		printWords(myPets);
		
		System.out.println(sum(3, 5, 10)); // for method sum will calculate SUM.
		
		int budget= 200;
		if(sum(10, 12,12,22) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total= sum(234,23,2312,12,1);
		System.out.println("total "+ total);
		
		cook("burito", " chees", "rice","salsa");
		cook("avocado tost", "avocado","wheat bread");
		
		shopingList(1000, "Avocado","bread","butter");
	}

	public static void printWords(String... words) {
// handle like it is array

		for (String w : words) { // will print words from array words!
			System.out.println(w);
		}

	}

	public static int sum(int... nums) { // WILL PRINS SUM OF ALL NUMBERS
		int sum = 0;
		for (int s : nums) {
			sum = sum + s;

		}

		return sum;
	}
//                          burito  || avocado   ingridients
	public static void cook(String name, String...ings) {
		System.out.print("Food: "+ name);
		System.out.println(Arrays.toString(ings));
	}
	public static void shopingList(int totalPrices, String...items) {
		System.out.println("Total cost "+ totalPrices);
		System.out.println(Arrays.toString(items));
	}
	
}
