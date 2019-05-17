package day38_ArrayList03;

import java.util.*;

public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<>();
		numList.add(23);
		numList.add(12);
		numList.add(233);
		numList.add(123);
		numList.add(121213);
		numList.add(2353);
		numList.add(263);

		System.out.println(numList);
		Collections.sort(numList);
		System.out.println(numList);
		
		List<String> strList= new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabat");
		strList.add("Dina");
		strList.add("Vitya");
		System.out.println(strList);
		
		Collections.sort(strList);
		System.out.println(strList);
		
		// MAX, MIN
		
		int maxNum =  Collections.max(numList);
		int minNum =  Collections.min(numList);
		
		System.out.println("Max: "+maxNum);


		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);

		System.out.println(maxName);  // will print name that starts with last letter
		System.out.println(minName); // will print name that first letter starts with earlier letter from alphabet 
		
		Collections.shuffle(strList);
		
		System.out.println(strList);
	}

}
