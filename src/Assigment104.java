import java.util.Scanner;

public class Assigment104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    for(int i=0; i<=nums.length; i++) {
	    	if(nums[i]==nums[i]+1)
		    	{
	    		System.out.println(true);
		    	}else {
		    		System.out.println(false);
		    	}
	    }
	    
	    
	
	    
	}
}
