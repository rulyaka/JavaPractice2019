package ClasswithVasya;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * String email= generateEmail("Petro", "Bamper");
		 */
		// System.out.println(email);
		// String email1= generateEmail("Petro", "Bamper", "zt");
		//// System.out.println(email1);

		String[] characters = { "Petro Bmaper", "Andrii Sus", "Victro Fedorovych", "Mykola Yanovych", "Vitya Mucha" };

		for (String str : characters) {
			String name = str.split(" ")[0];
			String lastNmae = str.split(" ")[1];
			System.out.println(generateEmail(name, lastNmae));
		}

	}

	public static String generateEmail(String firstName, String lastName) {

		return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@gmail.com";

	}

	public static String generateEmail(String firstName, String lastName, String domain) {

		return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@" + domain + ".com";
	}
}