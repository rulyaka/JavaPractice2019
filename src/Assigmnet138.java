import java.util.Arrays;
import java.util.Scanner;

public class Assigmnet138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		
		int[] zero = new int[inhabitants.length ];
		
		int day=0;
		 while(!Arrays.equals(inhabitants, inhabitants)) {
			 System.out.println(" Day "+day+" ");
			 System.out.println(Arrays.toString(inhabitants));
			 day++;
			 
			 for(int i=0; i<inhabitants.length; i++) {
				 if(inhabitants[i]==0) {
					 if(i==0) {
						 inhabitants[i+1]/=2;
						 if(i+2<inhabitants.length && inhabitants[i+2]==0) {
							 inhabitants[i+1]*=2;
						 }
						 i++;
					 }else if (i==inhabitants.length-1) {
						 inhabitants[i-2]/=2;
						 i++;
					 }else {
						 inhabitants[i-2]/=2;
						 inhabitants[i+1]/=2;
						 if(i+2<inhabitants.length && inhabitants[i+2]==0) {
							 inhabitants[i+1]*=2;
						 }
						 i++;
					 }
				 }
			 }
			 
		 }
		 System.out.println(" Day "+day+" ");
		 System.out.println(Arrays.toString(inhabitants));
		System.out.println("---- EXTINCT ----");
		
		
		
		
		
		
	}

}
