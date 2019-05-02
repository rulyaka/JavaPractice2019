import java.util.Scanner;

public class assigment85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			System.out.println("Add one more item?");
			countinue = scan.next();
			shoppingListReport = shoppingListReport + "Item" + count + ": " + item + " Price: " + price + ",";
			totalPrice += price;
			count++;
		} while (count <= 10 && !countinue.equals("no"));
		System.out.println(shoppingListReport+", ");
		System.out.println("Total price: " + totalPrice);
	}
}
