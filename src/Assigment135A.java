import java.util.Arrays;
import java.util.Scanner;

public class Assigment135A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    //WRITE YOUR CODE HERE
	    	if(nums.length >= 2)
		{
			int temp = nums[0];
			for(int i = 0; i < nums.length - 1; i++)
				nums[i] = nums[i+1];
			nums[nums.length-1] = temp;
		}
	    	System.out.println(Arrays.toString(nums));	    

	  }
	
	}


