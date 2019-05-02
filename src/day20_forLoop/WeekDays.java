package day20_forLoop;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int day1 = 1; day1 <= 7; day1++) {
			switch (day1) {
			case 1:
				System.out.println(day1 + " Monday");
				break;
			case 2:
				System.out.println(day1 + " T");
				break;
			case 3:
				System.out.println(day1 + " W");
				break;
			case 4:
				System.out.println(day1 + " T");
				break;
			case 5:
				System.out.println(day1 + " F");
				break;
			case 6:
				System.out.println(day1 + " S");
				break;
			case 7:
				System.out.println(day1 + " Sunday");
				break;
			default:
				System.out.println("End");
			}
		}
	}

}
