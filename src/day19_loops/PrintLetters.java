package day19_loops;

import java.util.*;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Amazon";
		int idx = 0;
		while(idx< word.length()) {
		System.out.println(word.charAt(idx));
		idx++;
		
		}
		int idx2 = word.length()-1;// WILL READ TEXT REVERSE
		
		while(idx2 >=0); {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
	}

}
