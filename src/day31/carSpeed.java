package day31;

import java.util.Scanner;

public class carSpeed {

	public static void drive(String car, int speed) {
		Scanner scan = new Scanner(System.in);
		car = scan.next();
		speed = scan.nextInt();

		System.out.println(car + "is driving" + speed);
	}

	public static void main(String[] args) {

		int speed=0;
		String car = "";
		drive(car, speed);
	}
}