package day40;

import java.util.*;

public class WarmUpList {

	public static int countOccurances(ArrayList<String> arr, String word) {

		int counter = 0;
		for (String w : arr) {
			if (w.equals(word)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();

		arr.add("Moon");
		arr.add("Sun");
		arr.add("Saturn");
		arr.add("Earth");
		arr.add("plutto");
		arr.add("Mercury");
		arr.add("Saturn");
		arr.add("Saturn");
		
		String targetWord = "Sun";
		int count = countOccurances(arr, targetWord);
		if (count == 3) {
			System.out.println("Unit test Pass");
		}else {
			System.out.println("Failed " +count);
		}
	}

}
