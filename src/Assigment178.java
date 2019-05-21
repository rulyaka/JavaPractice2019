import java.util.*;
public class Assigment178 {
	
		  public static int[] mergR(int[] a,int[] b) {
			  int[]c = new int[a.length+b.length];
		      int count = 0;
		      
		      for(int i = 0; i < a.length; i++) { 
		          c[count] = a[i];
		          count++;
		       } 
		       for(int j = 0; j < b.length;j++) { 
		          c[count] = b[j];
		          count++;
		       }
			return c; 
		   
		  }//end mergR
		  public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			
		}
}
