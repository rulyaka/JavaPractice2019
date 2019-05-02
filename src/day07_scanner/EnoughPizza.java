package day07_scanner;

public class EnoughPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // clices ->8
		//slices per student ->2
		int pizzaCount = 50;
		int studentsCount = 145;
		
		boolean isEnoughPizza =pizzaCount * 8 >= studentsCount * 2; 
		
		System.out.println("Is enough pizza: " + isEnoughPizza);
				
		
	}

}
