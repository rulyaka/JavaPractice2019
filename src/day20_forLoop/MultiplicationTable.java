package day20_forLoop;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method s

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();

		if (num < 1 || num > 10) {
			System.out.println("Invalid input");
			return;
		}

		
		for (int i = 1; i <= 10; i++)
			
		{
			
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

}
