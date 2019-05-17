import java.util.Arrays;

public class Assigment195 {
	public static boolean isAnagram(String word1, String word2) {

		char[] arr1= word1.toLowerCase().replace(" ", "").toCharArray();
		char[] arr2=word2.toLowerCase().replace(" ", "").toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		

	}

}
