package day38_ArrayList03;

import java.util.*;

public class MtheodesSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		list.add(0, "yellow"); // will shift , put yellow at the index0
		System.out.println(list.toString());

		System.out.println("Number of elements : " + list.size()); // will return number of values
		System.out.println("3: " + list.get(3)); // will return value from index

		list.remove(0); // will remove yellow colour
		System.out.println(list.toString()); // removes first occurence

		list.remove("blue");
		System.out.println(list.toString()); // removes blue

		list.set(0, "white");
		System.out.println(list.toString()); // will replace first item with white

		System.out.println("grey: " + list.indexOf("grey"));

		// isEmpty() returns true if list is empty
		System.out.println("is list empty - " + list.isEmpty());

		// Contains(element) ===> returns true if value is present
		System.out.println("white is in the list - " + list.contains("white"));

		List<String> list2 = new ArrayList<>();

		// addAll method ---- adds all values from one list into another

		list2.addAll(list);
		System.out.println("list2: "+ list.toString());

		// ContainsAll check if list has all values of another list
		System.out.println("containsAll "+list.contains(list2));
		
		
	//	EQUALS(LIST1)  chacks if 2 lists are exactly equal
		System.out.println(" equals : "+ list.equals(list2));
		
		list2.add("pink");
		// removeAll(list1). removes all matcjing values fromyour list are in the other
		
		list2.removeAll(list);
		System.out.println("List2 after remove all "+list2);
		System.out.println("list1: "+ list);
		
		//AddAll(index, list) adds new list values starting from given index
		
		list2.addAll(0, list);
		
		System.out.println("list2 after list2.addAll(0, list): "+ list2);
		
		
		list.clear();
		list2.clear();
		System.out.println("Both enmpty? - "+(list.isEmpty()&& list2.isEmpty()));
		
		
		
		
		
	}

}
