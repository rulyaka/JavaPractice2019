package day38_ArrayList03;

import java.util.*;

public class EqualsMethod {
	public static void main(String[] args) {

		List<String> friends1 = new ArrayList<>();
		
		
		List<String> friends2 = new ArrayList<>();
		
		friends1.add("Roman");   // should be exact the same order index
		
		friends1.add("Orhan");
		friends1.add("Elizabeth");
		friends1.add("Natalia");
		
		
		friends2.add("Roman");
		friends2.add("Natalia");
		friends2.add("Orhan");
		friends2.add("Elizabeth");
		
		
		System.out.println(friends1);
		System.out.println(friends2);
		

		
		if(friends1.equals(friends2)) {
			System.out.println("Same friends");
		}else {
			System.out.println("Diferent");
		}

	}
}
