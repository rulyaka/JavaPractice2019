package day40;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		
		CellPhone cell2= new CellPhone();
		cell2.brand="Siemens";
		cell2.screenSize=1.5;
		cell2.color="red";
		cell2.price=12;
		System.out.println("brand "+ cell2.brand);
		
		
		System.out.println("###### Caling methods");
		cell1.call();
		cell1.massage();
		
		cell2.call();
		cell2.massage();
		cell2.takePhoto();
	}

}
