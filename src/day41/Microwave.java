package day41;

public class Microwave {

	String brand;
	boolean isOn;

	public void turnOn() {
		if (isOn==true) {
			System.out.println(brand +" is already on");
		} else {
			System.out.println("Turning on "+ brand+ " microwave");
			isOn=true;
		}
	}

	public void turnOf() {
		if (isOn == false) {
			System.out.println(brand+"Is already off");
		} else {
			System.out.println("Turning  off "+brand);
			isOn=false;
		}
	}

	public void heat(String food) {
		if (isOn == true) {
			System.out.println("Heating the pizza");
		}else {
			System.out.println("Microwave is OFF"+food);
		}
	}
}
