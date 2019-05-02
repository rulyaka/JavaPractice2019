package day20_forLoop;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word= "Wooden Spoon";
		
		
		for(int i=0; i<word.length(); i++) { 
			System.out.println(word.charAt(i));
		}
		
		for(int i=0; i<word.length(); i++) {
			char letter=(word.toLowerCase().charAt(i));
			if(!(letter=='a' || letter == 'e' || letter == 'o' || letter=='i' || letter=='u')) {
				System.out.print(letter+ " ,");
				
			}
		}
		
	}

}
