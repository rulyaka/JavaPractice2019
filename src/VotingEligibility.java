import java.util.Scanner;

public class VotingEligibility {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner keyboard = new Scanner(System.in);
	int votingAge= 18;
	
    System.out.println("How old are you");
		int yourAge = keyboard.nextInt();
		int  years = yourAge - votingAge;
		int yearsLeft = votingAge - yourAge;
		
		if (yourAge >= votingAge) {
			
			System.out.println("You are elegible.");
			System.out.println("you have been eligible for " + years +"  years");
		}else {
			System.out.println("you are not eligible to vote");
			System.out.println("you still have " + yearsLeft+" more years to go");
		}
				
		
	}

}
