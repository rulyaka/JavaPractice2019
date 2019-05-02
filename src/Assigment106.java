import java.util.Scanner;

public class Assigment106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
		
		String[] arr = sentence.split(" ");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
