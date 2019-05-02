package day19_loops;

import java.util.*;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your balance");
		double balance = scan.nextDouble();
		int count = 0;

		while (balance > 0) {
			count++;// will count transaction amount
			System.out.println("What is transaction# " + count + " amount");
			{
				double numberOfTransactions = scan.nextDouble();
				if (numberOfTransactions > balance) {// if amount that needs to be withdraw is bigger then the balance
					System.out.println("Your ballance is about to be negative");
				}

				balance -= numberOfTransactions;
				System.out.println("Current balance " + balance);
			}

			System.out.println("Incuficient fund " + balance);
			System.out.println("Transaction ttotal count " + count);
		}

	}

}
