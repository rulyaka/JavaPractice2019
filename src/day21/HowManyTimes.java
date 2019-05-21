package day21;

import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("How many items you purchasing");

		int itemsCount = scan.nextInt();
		double totalPrice = 0.0;
		String items = "";

		for (int count = 1; count <= itemsCount; count++) {
			System.out.println("What is item " + count + "?");
			String itemName = scan.next();

			System.out.println("How much is item name");
			double itemPrice = scan.nextDouble();

			items += itemName + ", ";// <===== ", "remove it
			totalPrice += itemPrice;

		}
	

		System.out.println("Your items " + items);
		System.out.println("Your total price: $" + totalPrice);
	}

}
