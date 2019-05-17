package day41;

public class Car {

	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		String info = "make[" + make + "], model[" + model + "], color[" + color + "], currentSpeed[" + currentSpeed;
	}

	public  void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println("Ford is driving at " + speedLimit + "mph,");
		} else {
			System.out.println("is driving at " + speedLimit + "mph, following speed limit - 55");
		}
	}
	public void drive() {
		System.out.println(make+" "+model+" is driving...");
	}
	
	
	public void accelerate (int mph) {
		currentSpeed+=mph;
		System.out.println(currentSpeed);
	}
}
