package day11_logical_nestedif;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username,password;
		String validUsername = "cybertek@mail.com";
		String validPasword = "WoodenSpoon123";
		
		//Conditions:  username == validUsername
		//   password == validPaswordprint"
		// print "Login Successfull, Welcome"
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
	    username = scan.next();
		
		System.out.println("Enter password");
	     password = scan.next();
		
		validUsername = "cybertek@mail.com";
		validPasword = "WoodenSpoon123";

		if(username.equalsIgnoreCase(validUsername) && password.equals(validPasword)) {
		System.out.println("Login Successfull, Welcome");
			}else if( !username.equalsIgnoreCase(validUsername) && !password.equals(validPasword)) {
				System.out.println("Invalid  Username and invalis password");
			}else if( username.equalsIgnoreCase(validUsername) && !password.equals(validPasword)) {
				System.out.println("Invalid password");
			}else if ( !username.equalsIgnoreCase(validUsername) && password.equals(validPasword)) {
				System.out.println("Invalid  Username and invalis password");
			}
}
}
