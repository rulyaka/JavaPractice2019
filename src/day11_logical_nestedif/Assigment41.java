package day11_logical_nestedif;
import java.util.*;
public class Assigment41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		 
		 int age = scan.nextInt();
		 if(age < 2) {
			 System.out.println("ineligible");
		 }else if(age  >=3 && age <= 5) {
			 System.out.println("childhood");
		 }else if(age  >=6 && age <= 7) {
			 System.out.println("young reader");
		 }else if(age  >=8 && age <= 10) {
			 System.out.println("elementary");
		 }else if(age == 11 || age <= 12) {
			 System.out.println("middle");
		 }else if(age  == 13) {
			 System.out.println("impossible");
		 }else if(age  >=14 && age <= 16) {
			 System.out.println("high school");
		 }else if(age  >=17 && age <= 18) {
			 System.out.println("high school");
		 }else if(age  == 18) {
			 System.out.println("ineligible");
		 }
}
}