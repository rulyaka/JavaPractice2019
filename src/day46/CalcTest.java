package day46;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = Calculator.plus(55, 12);
		System.out.println("result: " + result);

		result = Calculator.minus(123, 34);
		System.out.println("result: " + result);
		
		Calculator c = new Calculator();
		System.out.println(c.multiple(12, 2));
		

	}

}
