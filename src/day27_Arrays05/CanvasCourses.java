package day27_Arrays05;

import java.util.Arrays;
import java.util.Scanner;

public class CanvasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String url = "https://learn.cybertekschool.com/courses/149";
		String[] urlArray=url.split("/");
		
		
		String[] urlArr=url.split("/");
		System.out.println("Length: "+urlArr.length );
		
		System.out.println(urlArr[urlArr.length - 1]);
		
		int courseId = Integer.parseInt(urlArr[urlArr.length - 1]);
		
		switch(courseId) {
		case 147:
			System.out.println("the course is Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("Qa Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
			default:
				System.out.println("Invalid number for the course");
				break;
		
		
	}

}
}