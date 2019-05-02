import java.util.*;

public class Assigment152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE

		Scanner scan = new Scanner(System.in);


		Arrays.sort(nums);
		
	    for(int i=0; i<nums.length; i++) {
	    	if(nums[i] != nums[i+1])
	    	{
	    		System.out.println(nums[i]);
	    		return;
	    	}else{
	    	  System.out.println(nums[8]);
	    	  return;
	    	}
	    }

	}
}
