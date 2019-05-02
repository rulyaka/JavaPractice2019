package day19_loops;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        Random random=new Random();// is used to generate random numbers
		
		
		int secretnumber = 83;
		int guessNumber;

		do {

			System.out.println("Enter the number: ");
			// this will give us a number between 0-100
			guessNumber = scan.nextInt();
			if (guessNumber < secretnumber) {
				System.out.println("to small");
			} else if (guessNumber > secretnumber) {
				System.out.println("to large");
			}
		} while (guessNumber != secretnumber);

		System.out.println("you won");

	}
}