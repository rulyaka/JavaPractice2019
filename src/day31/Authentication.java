package day31;

import java.util.Scanner;

public class Authentication {

	public static void login(String username, String password) {

		String validUsername = "mentoring@cybertek.com";
		String validPassword = "mebtor001";

		if (username.equalsIgnoreCase(validUsername) &&password.equalsIgnoreCase(password)) {
			System.out.println("Login successfull");
		} else {
			System.out.println("Invalid");
		}

	}

	public static void main(String[] args) {
	
		login("mentoring@cybertek.com"," mebtor001");
	}
}
