import java.util.Scanner;

public class Assigment102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String[] arr = sentence.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
