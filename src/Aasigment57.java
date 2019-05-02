import java.util.Scanner;
public class Aasigment57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter full name:");
		String name = scan.next();
		
		if(name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found!");
		}else {
			System.out.println("User not found!");
		}
	}

}
