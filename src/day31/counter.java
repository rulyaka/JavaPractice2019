package day31;

import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countUp(5);
		countUp(10);
		countDown(5);
		int j = 2;
		countDown(j);
		countDown(0);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int inputName = scan.nextInt();// CALL COUNTuP METHOD AND SET IT AS INPUT

	}

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid number");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}

	public static void countDown(int num1) {
		if (num1 < 1) {
			System.out.println("Invalid");
		} else {
			for (int j = num1; j >= 1; j--) {
				System.out.println(j + " ");

			}
		}
		System.out.println();
	}
}