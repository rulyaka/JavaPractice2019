import java.util.*;
public class Assigment83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    String countinue = "";
	    String names = "";
	    
		
		
		
		while(true){
		    System.out.println("Please enter guest name:");
		    names = names + input.next();
		    System.out.println("Do you want to enter new guest name:");
		    countinue = input.next();
		    if(countinue.equals("no")){
		      break;
		    }
		    names = names + ", ";
		  }
		  System.out.println("Guest's list: "+names);
	    
	}

}
