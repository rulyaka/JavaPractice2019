package day45;

import java.util.*;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	public EtsyAccount() {

		email = " ";
		firstName = "";
		password = "";
	}

	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email.indexOf("@")>0 && email.indexOf("@")<email.length()-1) {
			this.email = email;
		}else {
			System.out.println("Please enter valid message");
		}
		
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		if(isValidFirstName(firstName)) {
			this.firstName=firstName;
			
			
		}
	}

	private boolean isValidFirstName(String firstName) {
		
		if(firstName.startsWith(" ")|| firstName.endsWith(" ") ) {
			return false;
		}
		
		
		if (firstName.isEmpty()) {
			System.out.println("Can not be blank");
			return false;
		}
		for(int i=0; i<firstName.length(); i++) {
		char ch = firstName.charAt(i);
		if(!Character.isAlphabetic(ch) && ch !=' ') {
			return false;
		}
		}
		return true;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		if(password.length()<=5) {
			System.out.println("Error");
		}else {
			this.password=password;
		}
		
		this.password = password;
	}

	//constructor 3
	
	private EtsyAccount (String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password=getPassword();
	}
	
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "asfasfsafasfg123213";
		
		String rdPassword="";
		
		for(int i=1; i<=6; i++) {
			rdPassword+=letters.charAt(rd.nextInt(letters.length()));
				
			
		}
		return rdPassword;
	}
	
	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

}
