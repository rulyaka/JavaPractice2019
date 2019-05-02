package day15;

public class TrimSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = " String methodes ";  // removes methods at the beginning and end. Doesn't efect spacese in the middle 
		System.out.println(word1.trim());
		System.out.println(word1);
		
		String word2 = "      ThreeSpaces         "; // removes all of them at beginning and end !!
		
		word2 = word2.trim();
		System.out.println(word2.trim());
		
		
	}

}
