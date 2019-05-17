package day39;

import java.util.*;

public class UniuqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		
		nums.add(10);nums.add(10);nums.add(10);nums.add(8);
		nums.add(11);nums.add(10);nums.add(10);nums.add(10);

		System.out.println(nums);
		
		List<Integer> unique1 = new ArrayList<>(); 
		
		
		                                  // find unique NON DUPLICATE VALUES
		for(Integer num: nums) {
			if(!unique1.contains(num)) { // if unique1 doesn't contains num add it
				unique1.add(num); //<<<<<======= adding to unique1 num one by one
			}
		}
		System.out.println(unique1.toString());
		
		
		
		       
		
		List<Integer> unique2 = new ArrayList<>();
		
		for(int i =0; i<nums.size(); i++) {  // find unique ( appearence once)
			int count=0;
			
			Integer value = nums.get(i);
			for(int k =0; k<nums.size(); k++) {
				if(nums.get(k)== value && i != k) {
					count++;
					break;
				}
			}
			if(count == 0) {
				unique2.add(value);
			}
		}
		System.out.println(unique2);
		
	}

}
