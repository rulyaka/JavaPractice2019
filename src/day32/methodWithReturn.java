package day32;

public class methodWithReturn {
	/*
	 * this method returns int value
	 */
	public static void main(String[] args) {
		System.out.println(giveMe10());
		int i = giveMe10();
		System.out.println(i);
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("My name is " + myName);

	}

	public static int giveMe10() {
		System.out.println("returning 10 from method");
		return 10;
	}

	public static String giveMeYourName() {
		String name = "Vitya";
		System.out.println("Your name is");
		return name;

	}

}
