import java.util.Scanner;

public class Assigment94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		String myId;
		if (html.contains("myId")) {
			html = html.substring(html.indexOf("id") + 4);
			myId = html.substring(0, html.indexOf("\""));{
			System.out.println(myId);
			}
		} else {
			System.out.println("Invalid input!");
		}
	}
}
