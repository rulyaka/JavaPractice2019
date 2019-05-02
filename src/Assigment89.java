import java.util.Scanner;

public class Assigment89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
		String answer="";
		answer = answer + word;
		count--;
		while (count > 0) {
			answer = answer + separator + word;
			count--;
		}
		System.out.println(answer);
		
	}
}
