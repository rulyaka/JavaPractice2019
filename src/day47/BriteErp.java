package day47;

import java.time.LocalDateTime;

public class BriteErp {

	static {
		System.out.println("Lunch Browser"); // Automatically runs
		System.out.println("Navagate to : " + TestData.url);
	}

	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}

	public static void enterPassword() {
		System.out.println("Enter email: " + TestData.password);
	}

	public static void enterUrl() {
		System.out.println("Enter email: " + TestData.url);
	}

	public static void verifyLogin() {
		System.out.println("Enter email: " + TestData.userName);
		System.out.println("Actual name displayed: Petro Bamper");
		System.out.println("Login Successfull- "+LocalDateTime.now());
	}
}
