package day_26;

import java.util.Arrays;

public class BinarrySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] nums = {2,3,4,55,74,84};	
		
		System.out.println(Arrays.binarySearch(nums, 55));//3 index
		
		
		int i = Arrays.binarySearch(nums, 4);
		
		System.out.println(i);
		
		
		int [] nums1 = {2,333,4,5,2,84};
		System.out.println(Arrays.binarySearch(nums1, 2));
		Arrays.sort(nums);
		
		
		int[] arr1= {3,5,6};
		int[] arr2= {3,5,6};
		
		Arrays.equals(arr1, arr2);
	}

}
