package day41;

public class MyCars {
	public static void main(String[] args) {
		Car car1 = new Car();

		car1.make = "Mercedes";
		car1.color = "grey";
		car1.currentSpeed = 55;


		car1.drive();
		car1.accelerate(20);

		System.out.println(car1.currentSpeed);
		
		BMW bmw = new BMW();
		
		System.out.println(bmw.make);
		
		bmw.model="m3";
		bmw.showPrice();
		
		System.out.println("Car Price: "+ bmw.price);
		
		BMW bmw2= new BMW();
		
		bmw2.model="X3";
		bmw2.showPrice();
	}
}
