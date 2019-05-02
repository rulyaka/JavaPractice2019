import java.util.Arrays;
import java.util.Scanner;

public class Assigment150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
		timeConversion2("07:05:45PM");
	}

	public static void timeConversion(String s) {

		
			}
		
	

	public static void timeConversion2(String s) {
		String time = "";
		int hour = Integer.valueOf(s.substring(0, s.indexOf(":")));
		int minute = Integer.valueOf(s.substring(s.indexOf(":") + 1, s.indexOf(":", s.indexOf(":") + 1)));
		int second = Integer.valueOf(s.substring(s.lastIndexOf(":") + 1, s.lastIndexOf(":") + 3));

		if (s.endsWith("AM")) {
			if (hour == 12) {
				time = "01" + s.substring(3, s.indexOf("AM"));
			} else {
				time = s.substring(0, s.indexOf("AM"));
			}
		} else {
			if (hour == 12) {
				time = hour + ":" + (minute < 10 ? "0" + minute : minute) + ":" +  (second < 10 ? "0" + second : second);
			} else {
				time = hour + 12 + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second);
			}
		}

		System.out.println(time);
	}

}
