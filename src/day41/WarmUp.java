package day41;

import java.util.*;

public class WarmUp {

	public static List<Integer>  doubleTheList (List<Integer> myList) {
		//int num2=0;
		//for(int i:nums) {
			//num2=i*2;
			//nums.set(i, num2);
		//}
		//return nums;
		
		
		for(int i =0; i<myList.size(); i++) {
			myList.set(i,myList.get(i)*2);
		}
		return myList;
	}
	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();
		myList.add(14);
		myList.add(1);
		myList.add(4);
		myList.add(122);
		System.out.println(doubleTheList(myList));
	}
}
