package day46;

public class Vehicle {
	String type;
	static int numberOfVehicles;

	public static void vehicleInfo() {
//		System.out.println("type: "+ type);   will not work  cause is Vehicle is not static

		System.out.println("number of vehicles: " + numberOfVehicles);
		
		int count = getNumberOfVehicles();
		String make="Mercedes";
		make.toUpperCase();
	}

	public static int getNumberOfVehicles() {

		return numberOfVehicles;

	}
	
	public String toString() {
		return "Vehicle type "+type+" | count: "+numberOfVehicles;
	}
}
