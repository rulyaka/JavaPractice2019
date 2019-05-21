package day47;

public class VariableAccess {

	int MyInstancevar = 40; // <<<<===== will not work not static

	static int myStaticVariable = 55; // <<<<===== will work cause static

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myStaticVariable);

		VariableAccess var1 = new VariableAccess();

		System.out.println(var1.MyInstancevar); // you can reach MyInstancevar by creating object

		System.out.println(var1.myStaticVariable);
	}

}
