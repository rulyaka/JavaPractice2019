package day40;

public class MyContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact contact1 = new Contact();
		contact1.name = "Evgenia Jalilova";
		contact1.phoneNumber = "203-122-1233";
		contact1.email = "Evgenia@capitalone.com";

		contact1.call();
		contact1.sendEmail();
		contact1.sendEmail();
		
		Contact orhan = new Contact();
		orhan.name="Orhan Sultanov";
		orhan.phoneNumber="571-223-2323";
		orhan.email="mil.mail@.mil";
		
		System.out.println("Name: "+ orhan.name);
		System.out.println("phoneNumber: "+ orhan.phoneNumber);
		System.out.println("email: "+ orhan.email);
		
		orhan.call();
		orhan.sendEmail();
		orhan.sendMasseges();
		
		
		
		
		
	
	}
	
	

}
