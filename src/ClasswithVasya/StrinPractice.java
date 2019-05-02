package ClasswithVasya;

public class StrinPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java";
		word=word.toUpperCase();
		System.out.println(word);
		
		
		String word2 = new String("java");
		word2=word2.toUpperCase();
		System.out.println(word);
		System.out.println(word2);
		System.out.println(word.equalsIgnoreCase(word2));
	}

}
