package day38_ArrayList03;

import java.util.*;

public class removeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		list1.add(30);
		list1.add(312);
		list1.add(1234);
		list1.add(45);

		List<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.add(234234234);
		list2.add(4545);
		list2.add(32323423);
	
		

		// System.out.println(list1);
		// System.out.println(list2);

		list2.removeAll(list1);  // removes from list2 same numbers that l1 has and print unique for l2 that l2 doesn't have
		System.out.println(list2);
		
		list1.addAll(list2);	
		System.out.println(list1); // add to l1 all the values from l2!
		
		
		
	}
	

}
