import java.util.Scanner;

public class Assigment54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter number:");
		String weekDay = scan.next();
		switch(weekDay) {
		case "1" :
			System.out.println("Monday");
			break;
		case "2" :
			System.out.println("Tuesday");
			break;
		case "3" :
			System.out.println("Wednsday");
			break;
		case "4" :
			System.out.println("Thursday");
			break;
		case "5" :
			System.out.println("Friday");
			break;
		case "6" :
			System.out.println("Suturday");
			break;
		case "7" :
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid week day");
		}
		
	}

}
