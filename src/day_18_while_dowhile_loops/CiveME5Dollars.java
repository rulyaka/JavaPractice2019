package day_18_while_dowhile_loops;
import java.util.*;
public class CiveME5Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);	
		
	int dollars = 0;
	while(dollars!=5) {
		System.out.println("Give me 5 dollars");
		dollars = scan.nextInt();
	}
		System.out.println("Thank you");
	}

}
