 package day12_switch_ternary;
import java.util.*;
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

      String weather = scan.next();
      System.out.println("How is weather today?");
      switch(weather) {
      case "sunny":
    	  System.out.println("Go to park");
    	  System.out.println("Code Java");
    	  break;
      case "hot":
    	  System.out.println("Go swiming");
    	  System.out.println("Code Java");
    	  break;
      case "windy":
    	  System.out.println("Fly a kite");
    	  System.out.println("Code Java");
    	  break;
      case "rainy":
    	  System.out.println("Go shoping");
    	  System.out.println("Code Java");
    	  break;
      case "snow":
    	  System.out.println("Change your tires");
    	  System.out.println("Go skiing");
    	  System.out.println("Code Java");
    	  break;
    	  
    	  default:
    		  System.out.println("Code Java in any other weather");
    	  
      }
		System.out.println("End");
		
		
	}

}
