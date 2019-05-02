package day13_ternary_strings_intro;
import java.util.*;
public class CarSelectro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of car you are interested in? ");
		System.out.println(" 1)American \n 2)Japanese \n 3)German \n 4)Italian \n 5)Korean");
		
		
		int carType = scan.nextInt();
		String carOptions, carOrigin = null, report = null;
		double averagePrice = 0.0;
		
		switch (carType) {
		case 1:
			averagePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			report = carOptions+ "\nAverage price: "+ averagePrice;
				break;
		case 2:
			averagePrice = 32000;
			carOrigin = "Japannese";
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			report = carOptions+ "\nAverage price: "+ averagePrice;
				break;
		case 3:
			averagePrice = 55000;
			carOrigin = "German";
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			report = carOptions+ "\nAverage price: "+ averagePrice;
				break;
		case 4:
			averagePrice = 85000;
			carOrigin = "Italian";
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			report = carOptions+ "\nAverage price: "+ averagePrice;
				break;
		case 5:
			averagePrice = 25000;
			carOrigin = "Korean";
			carOptions = "Kia, Hyundai, Daewoo";
			report = carOptions+ "\nAverage price: "+ averagePrice;
				break;
			default:
				System.out.println("Car type not available");
				return;
		}
		System.out.println("You selected "+carOrigin+" car and your options are:\n"+ report);

		

	}

}
