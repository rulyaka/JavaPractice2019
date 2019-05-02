import java.util.*;

public class Assigment121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] strSplit = str.split(", ");
		String shortest = strSplit[0];
		for (int i = 0; i < strSplit.length; i++) {
			if (shortest.length() > strSplit[i].length()) {
				shortest = strSplit[i];
			}
		}
		int counter = 0;
		for (int i = 0; i < strSplit.length; i++) {
			if (shortest.length() == strSplit[i].length()) {
				counter++;
			}
		}
		String[] shortestWords = new String[counter];
		int j = 0;
		for (int i = 0; i < strSplit.length; i++) {
			if (shortest.length() == strSplit[i].length()) {
				shortestWords[j] = strSplit[i];
				j++;
			}
		}
		Arrays.parallelSort(shortestWords);
		System.out.println(Arrays.deepToString(shortestWords));
	}
}