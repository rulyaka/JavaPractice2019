package day34;
import java.util.*;
public class CountArray {
	public static void main(String[] args) {

		int[] nums = { 12, 22, 324, 5, 245, 643, 3 };

		System.out.println(findOccurances(nums, 5));

		int five = findOccurances(nums, 5);// looking for specific number 5 in this case, how 5 in arra nums
		System.out.println("5 values " + five);
		if (five > 0) {
			System.out.println(" We have 5");
		} else {
			System.out.println("No 5");
		}
		if (findOccurances(nums, 2) > 0) {
			System.out.println("WE have 2");
		} else {
			System.out.println("we dont have 2");
		}

		int one = findOccurances(new int[] { 12, 211, 12, 1, 2, 1, 1, 12, 2 }, 1); /// also will look how many 1 in the
																					/// array!
		System.out.println("one " + one);

	}

	public static int findOccurances(int[] arr, int vallue) {
		int counter = 0;
		for (int num : arr) {
			if (num == vallue) {
				counter++;
			}

		}
		return counter;
	}

	public static int[] getArray() {

		int[] retArray = { 12, 2, 3, 4, 5 };
		return retArray;

	}
	public static int[] getRandomArray(int size) {
		
		Random rand= new Random(); // create random class object
		int[] nums= new int[size]; // declare array with size number of elements
 		
		for(int i=0; i<size; i++) {
			nums[i]=rand.nextInt(101); // get random numbers assigning to array i
				
			}
		return nums;
		}
		
		
		
		
		
		
		
	}

