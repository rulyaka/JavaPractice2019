package day07_scanner;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int num = 0;
             int num2 = num++;
              
              
             System.out.println("num: "+ num);
             System.out.println("num2: " +num2);
              
              int n = 10;
              int n2 = ++n;
              
              System.out.println("n: " +n);
              System.out.println("n2: " +n2);
              
              int friends =10;
              System.out.println(++friends);
              System.out.println(friends);
              
              int p1 = 10;
              int sum = p1++ + 5;
              
              // p1 + 5 and assign to sum
              // p = p + 1
              
              System.out.println("Sum: "+ sum);
              System.out.println("p1: "+ p1);
              
              int batteries = 8;
              int oldBatteries=5;
              int totalBatteries = batteries++ + ++oldBatteries;
              
              System.out.println("batteries: " + batteries);//9
              System.out.println("oldBatteries: " + oldBatteries);//6
              System.out.println("totalBatteries: " + totalBatteries);//14 
              
	}
}
