import java.util.Scanner;
import java.lang.*;
public class Assigment67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.length()<5) {
	    	System.out.println("Too short!");
	    }else if(word.length()>5) {
	    	System.out.println("Too long!");
	    }else {
	    int ln=word.length();
	    for (int i = ln; i > 0; i--) {
	        System.out.print(word.charAt(i-1));
	    }
	    System.out.print(word.charAt(4));
	    }
	    
	}
	}

