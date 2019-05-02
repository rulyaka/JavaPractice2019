import java.util.Arrays;

public class Assigment167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		for (int i = 0; i < str.length(); i++) {// outer loop
			int temp = str.charAt(i);// get a number
			// System.out.println(temp);
			int counter = 0;
			//
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0 . then it is unique

			}

		}
		return "";
	}

	public static String mergeStrings(String one, String two) {
		String mix = "";
		int i = 0;
		int j = 0;
		if (one.length() > two.length()) {
			for (; i < two.length(); i++) {
				mix = one.charAt(i) + "" + two.charAt(i);
			}
			mix = mix + one.substring(i);
		} else {
			for (; j < one.length(); j++) {
				mix = one.charAt(j) + "" + two.charAt(j);
			}
			mix = mix + two.substring(j);
		}

		return mix;
	}
}