package day10logicaloperators_Conditions;
import java.util.*;
public class CreditScoreaRting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
      System.out.println("Enter cresit score");
      int creditScore = 800;
      
      //excellent = > 750 - 850
      if(creditScore >= 750 && creditScore<= 850) {
      System.out.println("Excellent");
	}else if(creditScore >= 700 && creditScore<= 749) {
		System.out.println("Good");
	}else if(creditScore >= 650 && creditScore<= 699) {
		System.out.println("Fair");
	}else if(creditScore >= 550 && creditScore<= 659) {	
		System.out.println("bad");
	}else if (creditScore >=0 && creditScore <= 549 ) {
		System.out.println("poor");
	}else{
		System.out.println("Invallid score");
	}
	  
	}
}
