package day28;

import java.util.Arrays;

public class LoopToTheArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[][] pizzas= {
        		 {"pineaple","pepronni"},//0
        		 {"Anchovies","mushroom","olives"},//1
        		 {"4 chees"},//2
        		 {"chicken","tomatoes","jalpenos"},//3
        		 {"green papers","zukini","brocolli","spinach","shrimp"},//4
              };
	//	System.out.println(Arrays.toString(pizzas[0]));
		for(String[] pizza:pizzas) {
			System.out.println(pizza.length+" -");
			System.out.println(Arrays.toString(pizza));
			
		}
		System.out.println("## For LOOP");
		for(int i=0; i<pizzas.length; i++) {
			System.out.println(pizzas[i].length +" - ");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for(String topping :pizzas[2]) {
			System.out.println(topping);
		}
		
		int[][] students = {
				{4,5,6},
				{12,5,7},
				{23,55,12,3}
				};
		for(int[] group:students) {
			for(int studentId: group) {
				System.out.println(studentId+", ");
			}
			System.out.println();
		}
		
		int[][] nums= {
				{10,20},//0
				{20,30,40},//1
				{100,200,400},//2
				{55,33,111,2221,222,1112},//3
				
				
		};
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]+" ");
				
			}
			System.out.println();
			}
		}
	

}
