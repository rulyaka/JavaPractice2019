package day15;
import java.util.Scanner;
public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Type words(s):");
     
     String words = scan.nextLine();
     
     System.out.println(words.replace("a", "1"));
     words = words.replace("a","y");
     System.out.println(words.replace("sad","happy"));
     words.replaceFirst("h", "d");
		
	}

}
