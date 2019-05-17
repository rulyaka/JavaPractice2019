package day40;

import day41.Car;

public class MyCars {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "c300";
		car1.color = "Grey";

		car1.printCarInfo();
	}
}
