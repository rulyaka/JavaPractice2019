
public class Assigment179 {
	public static String reverse(String input) {

		if (input == null || input.isEmpty()) {
			return input;
		}
		String reverse = "";
		for (int i = input.length() - 1; i > 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		return input;

	}
	public static void main(String[] args) {
		
	}

}
