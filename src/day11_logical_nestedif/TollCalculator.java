package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter vehicle type: "); // 1, 2
		
		
		int carType =  keyboard.nextInt();
		double price = keyboard.nextDouble();
		
		
		System.out.println("Is it rush our: yes | no");
		String rushHour = keyboard.next();
		
		boolean isRushOur;
		if(rushHour.equalsIgnoreCase("yes")) {	
					isRushOur = true;
			}else{
		isRushOur = false;
	}
if(carType == 1) {
	if(isRushOur) {
		price = 30.0;
	}else {
		price = 5.0;
	}
}else if(carType==2) {
	if (isRushOur) {
		price = 55.30;
		
	}else {
		price = 15.99;
	}
	
}
}
}
