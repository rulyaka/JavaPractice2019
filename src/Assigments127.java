import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Assigments127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	      int[] max = arr[0];
	      for (i = 1; i < arr.length; i++) 
	             if (arr[i] > max) 
	                 max = arr[i]; 
	        
	        System.out.println(Arrays.toString(max));
              }
          }
	    }//end for rows
	
