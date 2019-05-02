package day34;
import java.util.*;
public class MainArray {

	public static void main(String[] args) {
	
		
		//                    2 move               1 move
	System.out.println(Arrays.toString(CountArray.getArray()));	
	
	int[] nums= CountArray.getArray();
	
	System.out.println(Arrays.toString(nums));
	
	System.out.println(Arrays.toString(CountArray.getRandomArray(20))); /// geting rendom nums fromCountArray
	
	
	int[] randomNums = CountArray.getRandomArray(3);
	System.out.println(Arrays.toString(randomNums));
	
	}
	

}
