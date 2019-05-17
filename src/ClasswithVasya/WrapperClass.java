package ClasswithVasya;

public class WrapperClass {
	public static void main(String[] args) {

		int num = 10;
		
		Integer num2= new Integer(10);
		Integer num3 = new Integer(10);
		System.out.println(num == num2);// true
		System.out.println(num2 == num3);// false 
		
		System.out.println(num2.intValue() == num3.intValue());
		System.out.println(num2.equals(num3));
		
		// how to convert text into number
		
		String age = "25";
		int agenum = Integer.parseInt(age); // converted to actual number
		int agenum2= Integer.valueOf(age); // another way but returns object of Integer class
		if(agenum> 21) {
			System.out.println(" you are fine");
		}else {
			System.out.println("Underage");
		}
		String text = "Wind: 5 m/ph";
		// determine  if wind is safe if speed  is more than 30 mp/h
		
		String speed= text.substring(text.indexOf(":") + 2, text.lastIndexOf(" "));// get text  with a speed
	
		
		int converSpeed = Integer.parseInt(speed);// convert string into a number
		System.out.println("Speed "+ speed);
		if(converSpeed <= 30) {                   // condition  that determine if safe
			System.out.println("You are safe");
		}else {
			System.out.println("Danger");
		}
		
	}

}



