package day27_Arrays05;

import java.util.Scanner;

public class arrays05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time1 = new int[2];
		int[] time2 = new int[2];

		time1[0] = 15;
		time1[1] = 12;

		time2[0] = 12;
		time2[1] = 15;
		
		

		Scanner scan = new Scanner(System.in);

		
		if(time1[0]< 0 || time1[0]>23) {
			System.out.println(" time1 Invalid hour");
		return;
		}
		if(time1[1]< 0 || time1[1]>59) {
			System.out.println("time1 Invalid minute");
		return;
		}
		if(time2[0]< 0 || time2[0]>23) {
			System.out.println("time2 Invalid hour");
		return;
		}
		if(time2[1]< 0 || time2[1]>59) {
			System.out.println("time2 Invalid minute");
		return;
		}
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if(time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else { // hours are equal, check minutes
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if(time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Same Time!");
			}
		}
		}
}
	
