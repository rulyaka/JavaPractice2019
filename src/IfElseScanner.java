import java.util.Scanner;

public class IfElseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// passingPersentage = 65;

		// yourScorePersentege = take from scanner;
		// check if you passed or failed
		Scanner scan = new Scanner(System.in);

		int yourScorepercentage = scan.nextInt();

		int passingPercentage = 65;

		if (yourScorepercentage >= passingPercentage) {
			System.out.println("pass");
		} else {
			System.out.println("failed");
		}

	}
}
