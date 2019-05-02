package ClasswithVasya;

import java.util.Scanner;

public class Ifstatemnent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
		int age=scan.nextInt();
		if(age >0 &&age<21) {
			System.out.println("Underage");
		}else if(age<1){
			
		}else {
			System.out.println("You are fine");
		}
		
	}

}
