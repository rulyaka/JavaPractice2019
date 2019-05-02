import java.util.Arrays;
import java.util.Scanner;

public class Assigment149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt(), n = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		add_to_r(arr, n);
	}

	private static void add_to_r(int[] arr, int n) {

		int[] new_n = new int[arr.length + 1];
		new_n = Arrays.copyOf(arr, arr.length);
		new_n[new_n.length - 1] = n;

		System.out.println(Arrays.toString(new_n));
	}

}
