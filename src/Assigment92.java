import java.util.Scanner;

public class Assigment92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
	    int n = scan.nextInt();
	    int count=0;
	    
	   
	      
	       for (int i = 0; i <= str.length(); i++) {
	    	   if(str.substring(i, i+2).equals(n)){
	    		      count++;
	    		    }
	    	   System.out.println(count);
	       }
	      
	    
	    
	}

}
