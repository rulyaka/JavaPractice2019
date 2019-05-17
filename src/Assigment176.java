import java.util.*;

public class Assigment176 {
	public static void main(String[] args) {
		
	}
	public  int findMax(int[] args) {

		int max = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
                max = args[i];
			}
		}
		return max;

	}

	public  double findMax(double[] args) {
		double max = 0.0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
                max = args[i];
			}
		}
		return max;
	}
}