package day39;

import java.util.*;

public class CustomListMethod {
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();

		numsList.add(5);
		numsList.add(99);
		numsList.add(90);
		numsList.add(7);
		numsList.add(1);
		numsList.add(3);
		numsList.add(6);
		numsList.add(88);

		printList(numsList);
		List<Double> doubleList = new ArrayList<>();

		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.08);

		System.out.println(sumList(doubleList));
		System.out.println(getList(10));
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());

		System.out.println(getRandomList(4));
		List<Integer> rList = getRandomList(10);
		Collections.sort(rList);
		System.out.println(rList); // sort numbers from smaller to bigger

	List<String> strNums = new ArrayList<>();
	strNums.add("12");
	strNums.add("34");
	strNums.add("53");
	strNums.add("44");
	List<Integer> converted = convertToIntList(strNums);
	System.out.println(converted);
		
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.println(n + " ");
		}
		System.out.println();
	}

	public static double sumList(List<Double> nums2) {
		double sum = 0.0;
		for (Double num : nums2) {
			sum = sum + num;
		}
		return (int) sum;
	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			newList.add(i);
		}
		return newList;

	}

	public static ArrayList<Integer> getRandomList(int size) {
		List<Integer> randomNums = new ArrayList<>();
		Random r = new Random(); // object of Random class
		for (int i = 0; i < size; i++) {
			randomNums.add(r.nextInt(101));
		}

		return (ArrayList<Integer>) randomNums;

	}

	public static List<Integer> convertToIntList(List<String> strList) {
		List<Integer> newList = new ArrayList<>();
		for(String str : strList) {
			newList.add( Integer.parseInt(str) );
		}
		return newList;
	}
	
}
