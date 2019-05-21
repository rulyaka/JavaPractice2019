package day46;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cm1= new Customer("Abdalah Aleises", "asdas.mil@mail.mil");
		Customer cm2= new Customer("Petro BaMper", "petya.mil@mail.mil");
		Customer cm3= new Customer("Viktor Fedorovich", "vitya.mil@mail.mil");
		
		
		
		
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		Customer cm4= new Customer("nikola yanovich", "nikola.mil@mail.mil");
		System.out.println("Total customers: "+Customer.count);
		
		cm1.count=10;
		System.out.println(cm3.count);
		
	}

}
