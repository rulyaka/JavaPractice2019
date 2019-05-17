
public class Assigment193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LameCalculator lc = new LameCalculator();
		System.out.println("1+1 = " + lc.plus(1, 1));
		System.out.println("2-3 = " + lc.minus(2, 3));
		System.out.println("2x3 = " + lc.multiply(2, 3));
		System.out.println("10:2 = " + lc.divide(10, 2));
	}

	 public static int plus(int num1, int num2) {
			int result = num1 + num2;
			return result;

		}

	
	 public  int minus(int num1, int num2) {
			int result = num1 - num2;
			return result;
	 }
		public  int multiply(int num1, int num2) {
			int result = num1 * num2;
			return result;

		}

		public  int divide(int num1, int num2) {
			int result = num1 / num2;
			return result;

		}
	}
