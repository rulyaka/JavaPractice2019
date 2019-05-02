package day_26;

import java.util.*;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 23, 34, 33, 556, 54, 22 };
		{
			System.out.println(Arrays.toString(nums));
			String str = Arrays.toString(nums);
			System.out.println(str);

			Arrays.parallelSort(nums);
			System.out.println(Arrays.toString(nums));

			String[] languages = { "Zulu", "Ukrainian", "Polish", "Spanish", "Italian" };

			Arrays.sort(languages);
			System.out.println(Arrays.toString(languages));

			int[] nums2 = { 2,4, 33, 33, 22 };
			System.out.println(Arrays.toString(nums2));
			Arrays.sort(nums2);
			
			int lowest=nums2[0];
			int largest=nums2[nums2.length-1];
			
			System.out.println("Lowest num: "+lowest);
			
			
			
		}

	}

}
