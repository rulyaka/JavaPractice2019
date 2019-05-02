package day32;

import java.util.*;

public class Cooking {

	public static void add(String ing) {
		System.out.println("Add something " + ing);

	}

	public static void fry(int minutes) {
		System.out.println("Fryy " + minutes);

	}

	public static void mix(int sec) {
		System.out.println("Mix for 10 seconds " + sec + "seconds");

	}

	public static void boil(int min) {
		System.out.println("Boil it " + min);
	}

	public static void makePAsta() {
		System.out.println("Italian Pasta");
		add("Water, salt, olive oil,");
		boil(2);
		add("Spagheti pasta");
		boil(2);
		mix(1);
	}

	public static void makePancakes() {
		add("milk, eggs,flour,sugar,salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy");
	}
	
	public static void cook(String dish, String ingridients) {
		
		System.out.println("}|} "+dish.toUpperCase()+" Recipe");
		add(ingridients);
		System.out.println("Cook it");
		System.out.println("_____ "+dish.toUpperCase()+  " Is ready ___");
	}
	
	public static void main(String[] args) {
		makePancakes();
		System.out.println("==================");
		makePAsta();
		System.out.println("=====================");
		makePancakes();
		System.out.println("==================================");
		cook("Ommeletee", "Egs");
	}
}