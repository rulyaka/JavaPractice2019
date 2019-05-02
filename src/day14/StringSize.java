package day14;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Good Morning";
		// check if it matches "Good Morning" and print matches
// or Not Match

		if (str1.contentEquals("Good Mrning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not match");
		}
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		} else {
			System.out.println("Not amtch - ignore case");

			System.out.println(str1.toUpperCase());
			System.out.println(str1);
			str1 = str1.toUpperCase();
			System.out.println("After assigment: " + str1);

			// convert to lovercase

			if (str1.toLowerCase().equals("good morning")) {
				System.out.println("Chained methodes: match");
			} else {
				System.out.println("Chained methods: do not match");
			}
			String myName = "Ruslan";
			System.out.println(myName.length());

			int length = myName.length();
			System.out.println("My name's length: " + length);
			// Usernames must be exactly 8 characters .

			String userName = "Ruslan9";
			if (userName.length() == 8) {
				System.out.println("Good");
			} else {
				System.out.println("Wrong");

			}
			String password = "wooden";
			if (password.length() > 6) {
				System.out.println("Password is good");
			} else {
				System.out.println("Password is too short");
			}
			int passwordLength = password.length();

			if (passwordLength < 6) {
				System.out.println("Invalisd password");

			} else {
				System.out.println("Valid password");
			}
//			passwordLength = pasword.length();

		}

	}

}
