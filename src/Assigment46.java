import java.util.*;

public class Assigment46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, digit1, digit2, digit3, digit4, digit5;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		num = scan.nextInt();
		digit1 = num/10000;
		System.out.println(digit1);
		digit2 = num/1000%10;
		System.out.println(digit2);
		digit3 = num/100%10;
		System.out.println(digit3);
		digit4 = num/10%10;
		System.out.println(digit4);
		digit5 = num%10;
		System.out.println(digit5);

	}

}
