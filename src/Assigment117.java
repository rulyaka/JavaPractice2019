import java.util.Arrays;

public class Assigment117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {

		// TODO : YOUR CODE GOES HERE ----------------------
		int counter = 0;
		for (String s : arr) {
			if (s.contains("e")) {
				counter++;
			}
		}
		String[] fewValues = new String[counter];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				fewValues[j++] = arr[i];
			}
		}

		// YOUR CODE ENDS HERE -----------------------

		return fewValues;
	}
}
