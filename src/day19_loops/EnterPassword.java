package day19_loops;

import java.util.*;

public class EnterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String password = "asdassa";
		String input;

		do {
			System.out.println("enter a password");
			input = scan.next();
		}while(!input.contentEquals(password)); // if input is not same  keep asking to enter pasword
		
	}

}
