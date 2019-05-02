import java.util.*;

public class Assigment155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		// WRITE YOUR CODE HERE
		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		System.out.println(num2);
	}
}
