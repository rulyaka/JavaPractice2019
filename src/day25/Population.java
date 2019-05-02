package day25;

import java.util.*;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] popultaion = new int[5];
		popultaion[0] = 5000;
		popultaion[1] = 10000;
		popultaion[2] = 7000;
		popultaion[4] = 4334;
		popultaion[3] = 8907;

		// int popultaion={5000,1000,7000,4343,3222}

		System.out.println("City1 population :" + popultaion[0]);
		System.out.println("City2 population :" + popultaion[1]);
		System.out.println("City3 population :" + popultaion[2]);
		System.out.println("City4 population :" + popultaion[3]);
		System.out.println("City5 population :" + popultaion[4]);

		int idx = 0;
		System.out.println("City0 population :" + popultaion[idx]);

		idx++;
		System.out.println("City1 population :" + popultaion[idx]);

		String str = "abc"; // 3 === 3222
		System.out.println("City1 STR.LENGHT() population :" + popultaion[str.length()]);

		// String array aclled cities = ""
		String[] cities = { "Miami, London, Tokio,Kiev, Zhytomyr" };

		System.out.println("Popultaion of " + cities[0] + " is " + popultaion[0]);
		System.out.println("Popultaion of " + cities[1] + " is " + popultaion[1]);
		System.out.println("Popultaion of " + cities[2] + " is " + popultaion[2]);
		System.out.println("Popultaion of " + cities[3] + " is " + popultaion[3]);
		System.out.println("Popultaion of " + cities[4] + " is " + popultaion[4]);

	}
}