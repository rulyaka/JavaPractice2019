import java.util.Arrays;
import java.util.Scanner;

public class Assigment122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    int days = 0;
	    //TODO. Write you code below this line.
		int totaliInhabitants = 0;
		System.out.println("Day "+days++ +" "+Arrays.toString(inhabitants));
		do {
			  totaliInhabitants= 0;
		      for(int i = 0; i<inhabitants.length;i++) {
		    	  inhabitants[i] =inhabitants[i]/2; 
		      }
		      System.out.println("Day "+days++ +" "+Arrays.toString(inhabitants));
		      for(int inhabitantOfOneCity:inhabitants) {
		    	  totaliInhabitants = totaliInhabitants + inhabitantOfOneCity; 
		      }
		}while(totaliInhabitants>0);
		System.out.println("---- EXTINCT ----");
	 
	}
}
