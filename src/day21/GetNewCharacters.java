package day21;

import java.util.Scanner;

public class GetNewCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();// java
		String unique = "";

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);// read the letter and assign
			System.out.println(letter);

			if (!unique.contains("" + letter)) {
				unique += letter;
			}

		}

		

	}

}
