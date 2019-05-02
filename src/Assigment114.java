import java.util.Arrays;
import java.util.Scanner;

public class Assigment114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    Arrays.sort(nums);
		    for(int i=0; i<nums.length; i++) {
		    	if(nums[i] != nums[i+1])
		    	{
		    		System.out.println(nums[i]);
		    		return;
		    	}else{
		    	  System.out.println(nums[6]);
		    	  return;
		    	}
		    }
		    
		    
		
	}

}
