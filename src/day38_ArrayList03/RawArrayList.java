package day38_ArrayList03;

import java.util.*;

public class RawArrayList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("Saturday");
		list.add("Java ");
		list.add(12312);
		list.add(true);

		System.out.println(list); // AUTOMATICALLY CALL toString()
		String allValues= list.toString();
		System.out.println(allValues);
		
		String str =list.get(0).toString();
		System.out.println(str);      // will print Saturday index 0. All values stored as a raw type
		
		

	}

}
