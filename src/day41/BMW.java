package day41;

public class BMW {
	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		if(model.equals("330i")) {
			System.out.println("40,250");
		}else if(model.equals("740")) {
			System.out.println("86,450");
		}else if(model.equals("m3")) {
			System.out.println("66,500");
		}
	
	
	switch(model) {
	case "330i":
		price=40000;
		break;
		
	case "740i":
		price=86000;
		break;
		
	case "m3":
		price=66000;
		break;
		default:
			System.out.println(model+ " is not availble");
			price=0.0;
	}
	}
}
