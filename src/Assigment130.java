import java.util.Arrays;
import java.util.Scanner;

public class Assigment130 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		double total = 0;
		int counter = 0;
		float dificulty = 0;
		for (int judge = 1, i = 0; judge <= 7; judge++, i++) {
			System.out.println("Enter score for judge " + judge);
			score[i] = input.nextFloat();

		}
		
		System.out.print("Enter difficulty: ");
		dificulty = input.nextFloat();
		Arrays.sort(score);
		for (int i = 1; i < score.length - 1; i++) {
			total += score[i];
		}
		total = total * 0.6 * dificulty;
		System.out.println("Total: " + total);

	}

}
