package day38_ArrayList03;

import java.util.*;

public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums1 = new ArrayList<>();

		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(40);
		nums1.add(500);
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20);
		nums2.add(10);
		nums2.add(30);
		nums2.add(40);
		nums1.add(500);

		// chack if nums1 == nums2
		if (nums1.containsAll(nums2)) { // even nums1 has more values, all values from nums2 are in nums1 so it is true
			System.out.println("Nums1 containsAll nums2");
		} else {
			System.out.println("Doesn't contains");
		}
		System.out.println(nums2.contains(nums1));

		boolean b = nums1.containsAll(nums2) && nums2.contains(nums1);
		System.out.println(b);

		List<String> planA = new ArrayList<>();

		planA.add("repl");
		planA.add("run");
		planA.add("food");
		planA.add("sleep");

		List<String> planB = new ArrayList<>();
		planB.add("repl");
		planB.add("run");
		planB.add("food");
		planB.add("sleep");

		if (planB.containsAll(planA) && planA.containsAll(planB)) {
			System.out.println("Plans A and B match");    // all the values are the same nums1 and nums2
		} else {
			System.out.println("they don't");
		}

	}

}
