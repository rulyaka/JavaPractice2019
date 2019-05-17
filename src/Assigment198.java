import java.util.*;

public class Assigment198 {
	public static int[] addElements(int[] ints1, int[] ints2) {

//		int[] sum = new int[5];
//
//		sum[0] = ints1[0] + ints2[0];
//		sum[1] = ints1[1] + ints2[1];
//		sum[2] = ints1[2] + ints2[2];
//		sum[3] = ints1[3] + ints2[3];
//		sum[3] = ints1[3] + ints2[3];
//		return sum;

		int[] sum = new int[5];
		
		for(int i=0; i<sum.length; i++) {
			sum[i] = ints1[i] + ints2[i];
			
		}
		return sum;
		
		
	}
}