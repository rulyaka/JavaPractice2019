package day34;

public class MethodeOverloading {

	
	public static void add(int num1, int num2) {    // Methode overloading
		int result= num1+num2;
		System.out.println("Result "+ result);
	}
	
	public static void add(double num1 , double num2) {
		
		
		double result=num1+num2;
		
		System.out.println("Result "+ result);
	}
	
	public static void add(String str1 , String str2) {
		
		
		String result=str1+str2;
		
		System.out.println("Result "+ result);
	}
	public static void main(String[] args) {
		add("erer", "adasd"); // takin String because enter words
		add(12, 111); // taking int 
	}
}
