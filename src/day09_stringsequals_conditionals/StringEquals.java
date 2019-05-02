package day09_stringsequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		// using ==
		System.out.println(str1==str2);// true
		System.out.println(str1 == "java");// true
		System.out.println(str2 == "Java");// false
		
		
		//equals method PREFERRED WAY <=====
		System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals("java"));// true
        System.out.println(str2.equals("Java"));//false
        
        // String month = "March"
        String month = new String("March");
        String month2 = new String("March");
        
        
        System.out.println(month == month2);//false check memory
        
        System.out.println(month.equals(month2));// true
        System.out.println(month.equals("March"));// true
		
		
		
		
		
	}

}
