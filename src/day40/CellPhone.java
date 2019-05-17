package day40;

public class CellPhone {

	String brand; // null
	double screenSize; //0.0
	String color;//
	double price;
	
	public void call() {
		System.out.println("Calling....");
	}	
	
	
	public void massage() {
		System.out.println("Sending text....");
	}
	public void takePhoto()
	{
		
	}	
	public static void main(String[] args) {
	// 	System.out.println(brand);   WILL NOT COMPYLE WE NEED OBJECT TO USE BRAND
		//CREATE CELLPHONEOBJECT 
		CellPhone cell1= new CellPhone();
		System.out.println(cell1.brand);   // CALLING FROM CELLPHONE
		System.out.println(cell1.screenSize);
		cell1.brand="Nokia 6300";
		cell1.screenSize=2.0;
		cell1.color="Red";
		cell1.price=56;
		
		System.out.println("Brand: "+cell1.brand);
		System.out.println("screenSize"+cell1.screenSize);
		System.out.println("color"+cell1.color);
		System.out.println("price"+cell1.price);

		
		
		
	}
}
