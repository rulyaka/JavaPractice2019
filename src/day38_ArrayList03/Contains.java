package day38_ArrayList03;
import java.util.*;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2=list1;// point the same direction in in the memory
		ArrayList<String>months = new ArrayList<>(list1); // copy all values from list1
		System.out.println(months);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months);

		System.out.println(months.contains("Jan"));  // TRUE BECAUSE CONTAINS Jan, doesn't matter in which index it is
		
		// HOW TO CHACK MONTH IN CERTIAN POSITION
		
		System.out.println(months.indexOf("Feb")==1); // one way
		System.out.println(months.get(1).equals("Feb"));  // second way
		
		
		ArrayList<String> months2= new ArrayList<>(list1); // copy everything from list1
		
		System.out.println("Month: "+months.toString());
		System.out.println("Month2: "+months2.toString());
		
		//CHECK IF MOTNHS HAS ALL VALUES OF MONTH2
		
		if(months.containsAll(months2)) {
			System.out.println("All months are here");
		}else {
			System.out.println("Not all of them");
		}
		
		months2.add("Jan");
		if(months.containsAll(months2)) {
			System.out.println("All months are here");
		}else {
			System.out.println("Not all of them");
		}
	}

}
