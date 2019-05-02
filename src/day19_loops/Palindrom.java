package day19_loops;

import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String word = scan.next();
		String reversed = "";

		int idx = word.length() - 1;
		while (idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;

		}
		System.out.println(reversed);
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is a polindrome");
		} else {
			System.out.println("Not a polindrome");
		}
	}
}