import java.util.*;
public class Assigment51 {

	public static void main(String[] args) {
		
		
		double totalPay = 0;
		String numberOfPeopleString ="";
		double totalTip =0;
		
		 Scanner scan = new Scanner(System.in);
		 
		
		 System.out.println("Split");
		 String split = scan.next();
		
			 		 
		 System.out.println("Number of people:");
		 int numberOfPeople = scan.nextInt();
		 
		 System.out.println("Check amount:");
		 double checkAmount = scan.nextDouble();
		 
		 System.out.println("Service Quality:");
		 String ServiceQuality = scan.next();
		 switch(ServiceQuality) {
	      case "Poor":
	    	  totalTip=checkAmount*0.05;
	    	  totalPay=checkAmount + (checkAmount * 0.05);
	    	break;
	      case "Fair":
	    	  totalTip=checkAmount*0.1;
	    	  totalPay=checkAmount + (checkAmount * 1);
	    	break;
		  case "Good":
			  totalTip=checkAmount*0.15;
	    	  totalPay=checkAmount + (checkAmount * 0.15);
			 break;
		  case "Great":
			  totalTip=checkAmount*0.20;
	    	  totalPay=checkAmount + (checkAmount * 0.20);
	    	break;
		  case "Excellent":
			  totalTip=checkAmount*0.25;
	    	  totalPay=checkAmount + (checkAmount * 0.25);
	    	break;
		  default:
				 break;
		 }
		 
		 numberOfPeopleString= "&";
		for( int i=1; i<=numberOfPeople-1; i++) {
		numberOfPeopleString +="&";
		}
		 
		System.out.println("Number of people entered: " + numberOfPeopleString);
		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " +totalPay/numberOfPeople);
		System.out.println("Tip per person: " +totalTip/numberOfPeople );
	}

}
