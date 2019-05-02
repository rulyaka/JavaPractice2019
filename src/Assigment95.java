import java.util.Scanner;

public class Assigment95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		if (str.indexOf("bread") != str.lastIndexOf("bread") && str.contains("bread")) {
			System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
		} else {
			System.out.println("nothing");
		}

	}
}