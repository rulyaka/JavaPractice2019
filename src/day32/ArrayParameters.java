package day32;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArraay[] = { 44, 44, 34, 2342, 432 };
		printArray(myArraay);
		 
		int[] myNums = { 3, 3, 3, 22, 2, 2, 2 };
		int[] one = { 10, 2, 22 };// numsSmall
		int[] two = { 3, 1,2,2,2,2 }; // numsLarge
		printArray(one);
		
		print2Arrays2(one,two);
	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.println(n + " ");
		}
		System.out.println();
	}

	public static void print2Arrays(int[] numsSmall, int[] numsLarge) {
		if (numsSmall.length > numsLarge.length) {
			System.out.println(Arrays.toString(numsSmall));
			System.out.println(Arrays.toString(numsLarge));
		} else if (numsSmall.length < numsLarge.length) {
			System.out.println(Arrays.toString(numsLarge));
		} else {
			System.out.println("Equal");
		}

	}

	public static void print2Arrays2(int[] numsSmall, int[] numsLarge) {
		if (numsSmall.length > numsLarge.length) {
			printArray(numsSmall);
			printArray(numsLarge);
			System.out.println(Arrays.toString(numsSmall));
		} else {
			System.out.println(Arrays.toString(numsLarge));// will print this on because is bigger numsSmall=one
		}
	}
}