package classWithMaruf;

public class CallPeople {
	public static void main(String[] args) {

		People m = new People();
		System.out.println(m.hardToGet); // need to create object cause is not object

		System.out.println(People.easyToGet); // because in class People variable easyToGet - STATIC.

		m.sayMyName();
		
		People.whatMyName();
		
		
		
	}
	
}
