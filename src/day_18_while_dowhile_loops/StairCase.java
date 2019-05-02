package day_18_while_dowhile_loops;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stairs = "*";

		int num = 1;
		while (num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		stairs="*";
		while(stairs.length()<=10) {
			System.out.println(stairs);
			stairs+="*";//**********************
			num++;
		}

	}

}
