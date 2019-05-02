package day31;

import java.util.Arrays;

public class MethodWithStrings {
	public static void countwords(String sentence) {

		String[] arraySentence = sentence.split(" ");
		System.out.println("Number of words " + arraySentence.length);
		System.out.println("Wwrds are " + Arrays.toString(arraySentence));

	}

	public static void googleSearchResults(String result) {
		// "About 122,333 results(0.75 seconds)"
		//split string
		String[] words = result.split(" ");
		//remove ,
		String count = words[1].replace(",", "");
		//remove (
		String seconds = words[2].substring(words[2].indexOf("(")+1);
		System.out.println("Results: " + count);
		System.out.println("Time in seconds: " + seconds);
	}

	public static void main(String[] args) {
		countwords("Java is super fun");
		countwords("Go home");
		googleSearchResults("About 122,333 results(0.75 seconds");
		
	}
}
