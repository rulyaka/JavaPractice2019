package day21;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique+=ch;
		}
		System.out.println("Unique "+unique);
		
		
		String word2= "bananas";
		String unique2 = "";
		
		
		int i= 0;// b
		char ch2 = word.charAt(i);
		System.out.println("CH2:"+ch2);
		
		i++;
		ch2=word2.charAt(i);// a
		System.out.println("Ch2:"+ch2);
		
		//check if ch2 is in the unique2 variable
		
		
		
	}

}
