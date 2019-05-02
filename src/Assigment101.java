import java.util.Scanner;

public class Assigment101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		
	    for (String word : words) {
	    	char first=word.charAt(0);
	    	char last = word.charAt(word.length()-1);
			System.out.println(first+""+last);
	}

}
}