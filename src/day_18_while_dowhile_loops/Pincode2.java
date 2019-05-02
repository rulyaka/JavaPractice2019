package day_18_while_dowhile_loops;

import java.util.*;

public class Pincode2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int secretPincode = 4321;

		int pincode = 0;
		int attempts = 1;

		while (pincode != secretPincode && attempts <= 4) {
			System.out.println("enter pincode");
		pincode = scan.nextInt();
		attempts++;
		if (attempts == 4 && pincode != secretPincode) {
			System.out.println("card is blocked");
			return;// stop
		}
		
	}
		System.out.println("Acces granted");
	}
}
