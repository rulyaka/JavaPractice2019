package day31;

import java.util.Scanner;

public class calculator {

	public static void add(double num1, double num2) {
		double results = num1 + num2;
		System.out.println("Result " + results);

	}

	public static void substruct(double num1, double num2) {
		double results = num1 - num2;

		System.out.println("Result: " + results);
	}

	public static void devide(double num1, double num2) {
		double results = num1 / num2;
		System.out.println("Result: " + results);
		if (num1 == 0) {
			System.out.println("can not be zero");
			return;
		}
	}

	public static void multiply(double num1, double num2) {
		double results = num1 * num2;

		System.out.println("Result: " + results);
	}

	public static void remainder(double num1, double num2) {
		double results = num1 % num2;
		System.out.println("Result: " + results);
	}

	public static void main(String[] args) {

		add(32, 22);
		devide(123, 22);
		multiply(12, 3);
		substruct(3213, 45);
		remainder(12, 2);

		// using Scanner pass num and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operatoon: '+','-','/','%' ");
		String operator = scan.next();

		switch (operator) {
		case "+":
			add(n1, n2);
			break;

		case "-":
			substruct(n1, n2);
			break;

		case "%":
			remainder(n1, n2);
			break;
		case "*":
			multiply(n1, n2);
		case "/":
			devide(n1, n2);
			break;

		}

	}
}