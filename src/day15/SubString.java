package day15;

public class SubString {
	public static void main(String[] args) {
		String sentence = "Java String manipulation is fun!";
		System.out.println(sentence.substring(0, 4));// Java
		// print String.

		System.out.println(sentence.substring(5, 11));// String
		System.out.println(sentence.substring(7, 11));// ring
		//System.out.println(sentence.substring(10, 5));// exception....
		String a, b;
		
		if(a.length() > b.length()) {
		    return b+a+b;
		  }else if(b.length() > a.length()){
		    return a+b+b;
		  }
	}
}
