package day_16;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url");

		String url = scan.next();

		// www.amazon.com
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		} else {
			System.out.println("Invalid url format");
			return;
		}
		int dotIndex = url.length() - 4;

		if (url.charAt(dotIndex) == '.') {
			System.out.println(" . is the extension");
		} else {
			System.out.println(" . might be placed");
		}
		String domain = (url.substring(4, dotIndex));
		System.out.println(domain);

		String extension = url.substring(dotIndex + 1, url.length());

		System.out.println("Extension " + extension);
	}
	
	
}
