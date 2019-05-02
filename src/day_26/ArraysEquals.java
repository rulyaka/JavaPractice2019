package day_26;
import java.util.*;
public class ArraysEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1= {4,5,6,10,100};
		int[] nums2= {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1, nums2));
		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly the same");
		}else {
			System.out.println("Missmatch");
		}
	String[] strArr1= {"one","two","three"};
	String[] strArr2= {"one","Two","three"};// not equal because Upper case
System.out.println(Arrays.deepEquals(strArr1, strArr2));

boolean match=Arrays.equals(strArr1, strArr2);
System.out.println("match"+match);
	}

}
