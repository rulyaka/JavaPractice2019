import java.util.Scanner;

public class Assigment90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    int count=0;
	    
	    for(int i=0;i<=str.length()-2; i++)
	    if(str.substring(i, i+2).equals("hi")){
	      count++;
	    }
	    System.out.println(count);;
	    
	    
	    
	    
	}

}
