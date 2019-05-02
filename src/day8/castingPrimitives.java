package day8;

public class castingPrimitives {
  public static void main(String[] args) {
	  
	  
	  int i = (int)3.4;
	  
	  System.out.println("i :" + i);
	  
	  double price= 230.50;
	  int dollars = (int)price;
	  
	  System.out.println("Price: " +price);
	  System.out.println("Dollars: " + dollars);
	  
	  int count = 244;
	  byte byteCount = (byte) count;
	  System.out.println("Byte count; "+ byteCount);
	
	  long longValue = 345645L;
	  int intValue = (int) longValue;
	  
	  System.out.println("Int value: " + intValue);
	  
	  int large= 5678;
	  short small = (short)large;
	  
	  System.out.println("Small : " + small);
	  
	//  250        250   250.2
	  int result =(int)(500.4/ 2.0);
	  System.out.println("Result: " + result);
  }	
}
