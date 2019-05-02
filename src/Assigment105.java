import java.util.Scanner;

public class Assigment105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   	char first=0;
		  char last=0;
		  
		  for (String word : words) {
		    	 first =word.charAt(0);
		    	 last = word.charAt(word.length()-1);
		    	 
				    System.out.print(first+""+last+", ");
	}

}
}