package day40;

public class Contact {

	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("Calling " + name);
	}

	public void sendMasseges() {
		System.out.println("sending mMessage " + phoneNumber);
	}

	public void sendEmail() {
		System.out.println("Sending email: " + email);
		
	}
}
