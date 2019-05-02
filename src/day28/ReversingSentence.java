package day28;

import java.util.*;

public class ReversingSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "you are very interesting person" ;
		
		String[] arrSentence = sentence.split(" ");
		System.out.println("number of words"+arrSentence.length);
		
		System.out.println(Arrays.toString(arrSentence));
		
		String reversed = "";
		for (int i = arrSentence.length - 1; i >= 0; i--) {
			reversed+=arrSentence[i]+" ";
			
			
			
			
		}
		reversed=reversed.trim();
		System.out.print(reversed);
	}
}