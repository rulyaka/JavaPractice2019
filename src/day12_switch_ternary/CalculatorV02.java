package day12_switch_ternary;
import java.util.*;
public class CalculatorV02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		String character="";
		System.out.println("Enter first number:");
		double num1 =input.nextDouble();
	    System.out.println("Enter second number:");
		double num2 = input.nextDouble();
		
		double result = 0.0;
		
		switch(character){
		
		case"+":
  	     result= num1 + num2;
		   break;
		case"-":
	  	     result= num1 - num2;
			   break;
		case"/":
	  	     result= num1 /num2;
			   break;
		case"%":
	  	     result= num1 % num2;
			   break;
			   default:
			   System.out.println("Invalid operator selected: " + character);
		}
	
	}
	}
