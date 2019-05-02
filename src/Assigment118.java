import java.util.Arrays;
import java.util.Scanner;

public class Assigment118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
		
	    for (int i = 0; i < nums.length/2; i++) {
	    	  int temp = nums[i];
	    	  nums[i] = nums[nums.length- i-1];
	    	  nums[nums.length- i -1] = temp;
	    	  
	    	}
			
	    
			
	}
	
	}
