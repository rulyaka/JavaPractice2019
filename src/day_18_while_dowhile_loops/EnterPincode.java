package day_18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;

		int pincode = 0;

		// keep asking for pincode until correct one entered

		while (pincode != secretPincode) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
			
		}
		System.out.println("acces grsnted");

	}

}
