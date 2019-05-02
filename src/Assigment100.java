import java.util.Scanner;

public class Assigment100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}
		for (String word : arr) {
			System.out.println(word.substring(0,3));
		}

	}
}