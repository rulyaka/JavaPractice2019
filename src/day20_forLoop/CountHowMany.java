package day20_forLoop;

import java.util.*;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan= new Scanner(System.in);
         
         
		 String word = "computer programing";
		 
		 char myChar='m';
		 
		 int counter =0;
		
		 for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)== myChar ) {
				counter++;
			}
		 }
		
		System.out.println("Count: "+ counter);
		
		
	}

}
