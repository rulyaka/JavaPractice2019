import java.util.*;

public class Assigment166 {
	public static void main(String[] args) {
		System.out.println(mergeStrings("wooden", "spoon"));
		System.out.println(uniqueChars("java"));
		System.out.println(coverString("java methods", "me"));
	}

	public static String mergeStrings(String one, String two) {
		String mix = "";
		int i = 0;
		int j = 0;
		if (one.length() > two.length()) {
			for (; i < two.length(); i++) {
				mix += one.charAt(i) + "" + two.charAt(i);
			}
			mix = mix + one.substring(i);
		} else {
			for (; j < one.length(); j++) {
				mix += one.charAt(j) + "" + two.charAt(j);
			}
			mix = mix + two.substring(j);
		}

		return mix;
	}

	public static String uniqueChars(String str) {
		// what will return
		String result = "";
		// loop through the word, take chars one by one
		for (int i = 0; i < str.length(); i++) {
			// if there is no such a character, add it
			if (!result.contains(str.charAt(i) + "")) {
				result += str.charAt(i);
			}
		}
		return result;
	}

	public static String coverString(String main, String coverME) {

		return main.contains(coverME) && !main.contains("[") ? main.replace(coverME, "[" + coverME + "]") : main;

	}
}