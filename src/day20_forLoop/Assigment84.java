package day20_forLoop;
import java.util.*;
public class Assigment84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int days = 0;
		
	    while(inhabitants>0){
	        System.out.println("Day "+days +" [" +inhabitants +"]");
	        days++;
	        inhabitants=inhabitants/2;
	        
	      }
	      System.out.println("---- EXTINCT ----");
	    
	    
	}

}
