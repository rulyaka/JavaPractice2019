package day15;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = " ";
		String pasword = "";

		System.out.println(username.isEmpty());
		if (username.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}
		if (username.isEmpty() || pasword.isEmpty()) {
			System.out.println("Is emtpty");
		}
		if (username.length() == 0) {
			System.out.println("Usrname length is zero");
		}

	}

}
