import java.util.*;
public class Assigment65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
		
		 if(word.length()%2>0 && word.length() >=5){
		      char a =  word.charAt(word.length()/2-1);
		      char b = word.charAt(word.length()/2);
		      char c =  word.charAt(word.length()/2+1);
		      System.out.println(a+""+b+""+c);
		    }else{
		      System.out.println("invalid");
		    }
	}

}
