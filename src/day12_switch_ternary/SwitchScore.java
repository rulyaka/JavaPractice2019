package day12_switch_ternary;
import java.util.*;
public class SwitchScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 33;
		// 1 ->
		// 2 ->
		
		switch(score) {
		case 1:
			System.out.println("Score is 1");
		    break;
		    
		case 2:
			System.out.println("Score is 2");
			break;
			
		case 3:
			System.out.println("score is 3");
		  break;
		    
		    default:
		    	System.out.println("Invalid score");
		    
		    break;// option		    
		    
		}
		
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		
		switch(day) {
		  case 1:
		   System.out.println("Monday");
		   break;
		  case 2:
			   System.out.println("Tueasday");
			   break;
		  case 3:
			   System.out.println("Wednsday");
			   break;
		  case 4:
			   System.out.println("Thursday");
			   break;
		  case 5:
			   System.out.println("Friday");
			   break;
		  case 6:
			   System.out.println("Suturday");
			   break;
		  case 7:
			   System.out.println("Sunday");
			   break;
			   
			   default:
				   System.out.println("Not a such day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
