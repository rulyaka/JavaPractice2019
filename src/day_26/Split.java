package day_26;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("count " + wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		for (String word : wordsArray) {
			System.out.println(word);

		}
//		String diceResult="1-20 of 1,461 positions";
	//	String[] diceArray=diceResult.split(" ");
	//	
	///	
	//	System.out.println("total "+diceArray[4]);
		
	//	String[] diceArray2= diceResult.split("of");
		
	//	System.out.println(diceArray2[0].trim());
	//	System.out.println(diceArray2[1].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		
	
		String[] allWords =sentence.split(" ");
		String[] happySplit =sentence.split("happy");
		String[] iSplit=sentence.split("I");
		
		for(String w: allWords ) {
			System.out.println(w);
		}
		System.out.println("After ahppy split");
		for(String w: happySplit ) {
			System.out.println(w);
		}
		System.out.println("After ahppy split");
		for(String w: iSplit ) {
			System.out.println(w);
	}
	

}
}