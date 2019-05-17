

import java.util.*;

public class Assigment181 {
	public static String combineRs(String[] r1,String[] r2) 
	  {
	  
String[] c= new String[r1.length+r2.length];
	  
	  int counter=0;
	  for(int i=0; i < r1.length; i++) {
		  c[counter]=r1[i];
		  counter++;
	  }
	  for(int j=0; j < r2.length; j++) {
		  c[counter]=r2[j];
		  counter++;
	  }
	  return c.toString();
	  }
}
