import java.util.Scanner;

public class Assigment137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 0;
		int columns=0;
		
		for (int i = 1; i<=rows; i++) {
			for (int j = 1; j<=columns; j++) {
				if (i == 1 || i == rows ||  
	                    j == 1 || j == columns)             
	                    System.out.print("*");             
	                else           
	                    System.out.print(" ");             
	            } 
	            System.out.println(); 
	        } 
		 Scanner scan=new Scanner(System.in);
		    
			int sign=scan.nextInt();
if(sign>=1) {
	System.out.println("1");
}	else if(sign<0) {
	System.out.println("-1");
}		else {
	System.out.println("0");
}
			
		
			}

}
