import java.util.Scanner;

public class Assigment58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// YOUR CODE HERE

		if (word.length() % 2 > 0 && word.length() >= 3) {
			System.out.println(word.charAt(word.length() / 2));
		} else if (word.length() == 1) {
			System.out.println(word + word + word);
		} else if (word.length() % 2 == 0 && word.length() >= 4) {
			char a = word.charAt(word.length() / 2 - 1);
			char b = word.charAt(word.length() / 2);
			System.out.println(a + "" + b);
		} else if (word.length() == 2) {
			System.out.println(word + word);
		}
	}

}
