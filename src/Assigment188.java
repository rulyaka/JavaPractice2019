import java.util.*;

import day38_ArrayList03.removeAll;

public class Assigment188 {

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equalsIgnoreCase(targetWord)) {
				wordList.remove(targetWord);
			}
		}
	}
	public static void main(String[] args) {
		
		
		
		removeAll();
		
	}
}
