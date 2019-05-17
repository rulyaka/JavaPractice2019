import java.util.*;

public class Assigmen192 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		timesTwo(nums);
		
		System.out.println(nums);
	}

	// create your method below
	public static void timesTwo(ArrayList<Integer> nums) {

		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
	}
}
