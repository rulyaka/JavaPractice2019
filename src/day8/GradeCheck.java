package day8;
import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // A, B, C, D
		
		Scanner keyboard = new Scanner(System.in);
		char grade = keyboard.next().charAt(0);
		
		if (grade == 'A') {
			 System.out.println("Ecellent");
		}else {
			System.out.println("Your grade " +grade+ " is not good enough ");
			System.out.println("how many points you missed for A");
			int points = keyboard.nextInt();
			System.out.println("you could earn 10 more poitns " +points+ "more points if you studied harder ");
		}
		
		
		
		
		
	}

}
