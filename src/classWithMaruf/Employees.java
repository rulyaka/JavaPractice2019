package classWithMaruf;

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmailGenerator n = new EmailGenerator("Roman");

		System.out.println(n.getEmail());

		EmailGenerator n1 = new EmailGenerator("Petro");

		System.out.println(n1.getEmail());
		
		EmailGenerator.companyName="DoD";
		
		System.out.println(n1.getEmail());
		System.out.println(n.getEmail());
		
	}

}
