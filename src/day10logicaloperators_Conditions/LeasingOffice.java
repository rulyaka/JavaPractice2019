package day10logicaloperators_Conditions;

import java.util.Scanner;

public class LeasingOffice {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    int numberOfBedrooms = scan.nextInt();
    int startingPrice=0;	
    
    if(numberOfBedrooms == 1) {
    	startingPrice = 1100;
    	System.out.println("One Bedroom Selected");
    }else if(numberOfBedrooms == 2) {
    	startingPrice = 1850;
    	System.out.println("Two Bedroom Selected");
    }else if(numberOfBedrooms == 3) {
    	startingPrice = 2550;
    	System.out.println("Three Bedroom Selected");
    }else if(numberOfBedrooms == 3) {
	    startingPrice = 2550;
	    System.out.println("No such Bedrooms available");
    }else {
    	System.out.println("No such Bedrooms available");
    }
    
    System.out.println("Starting Price: " +startingPrice);
    
	
	
}
}
