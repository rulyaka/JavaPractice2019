package day36_WrapperClass;

public class WrapperClassMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Boolean.TRUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);

		int count = Integer.parseInt("234234"); // convert string to primitive
		System.out.println("count: "+ count);
		
		int count2 = Integer.valueOf("234324");
		System.out.println("count2: "+count2);
		
		
		System.out.println(Character.isAlphabetic('a')); // will say true
		System.out.println(Character.isAlphabetic('1')); // false
		
		System.out.println(Character.isLetter('q'));
		
		System.out.println(Character.isDigit('9')); // true is digit
		String str = "java101";
		
		
		System.out.println(Character.isDigit(str.charAt(4))); // in java101 will read 4th letter and it is a digit--->> true
		
		String word = "abs12341afd1";
		
		
		for(int i=0; i<word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}
		}
		
	}

}
