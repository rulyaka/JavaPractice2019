package officeHours;

import java.util.Arrays;

public class April__23 {
	public static void main(String[] args) {
		int [] arr1 = {1, 5, 7};
		int [] arr2 = {20, 5, 22, 4, 7};
		
		// check if all items in arr1 present in arr2
		//boolean containsAll = true;
		
		
		for(int n1 : arr1) {
			System.out.println("OUTER: "+n1);
			int count =0;
			
			for(int n2 : arr2) {
				//System.out.println("INNER: "+n2);
				if(n2==n1) {
					System.out.println("FOUND!! "+ n1+ " is in Arr2!");
					count++;
					break;
				}
			}
			if (count==0 ) {
				System.out.println("DID NOT FIND1! "+n1+" nis not in Arr2!");
			}
		}
		
		
		
		
		
	}

}
