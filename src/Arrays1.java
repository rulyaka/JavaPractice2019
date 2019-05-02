
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
			
			
			
		}
       String[] words = { "cat", "dog", "pig"}; 
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i]+", ");
			
			
		}
		
		for(String word: words) {
			System.out.println(word);
		}
		for(char c: values) {
			if(c == 'o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}

		}
		int[] nums;
		
		
	}
	

}
