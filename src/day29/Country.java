package day29;

import java.util.Arrays;

public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] countries = {
				{"USA","Washington DC"},
				{"Canada","Ottawa"},
				{"Mexico","Mexico city"},
				{"Peru","Lima"},
				{"Argentina","Boanes Aeros"},
				{"Bolivia",	"La Paz"},
				{"Macedonia","Scopia"},
				{"Kazakhstan","Nursultan"},
		};

		System.out.println(countries[0][0]+" | "+countries[0][1]);
		
		System.out.println(countries[7][0]+" | "+countries[0][1]);
		
		System.out.println(Arrays.deepToString(countries));
		
		for(int i=0; i<countries.length; i++) {
	
			System.out.println((countries[i][0]+"|"));// will print only first row
		}
		System.out.println();
		
		for(String[] country:countries) {
			System.out.println(country[1]+"|"); // will print just second row
		}
		System.out.println();
		 
			String[] cities=new String[countries.length];
			
			
			System.out.println(Arrays.deepToString(cities));
			for(int i=0; i<countries.length; i++) {
			cities[i]=countries[i][1];
			}
			System.out.println(Arrays.toString(cities));    // Printing only cities
			
			
			for(int row=0; row< countries.length; row++ ) {
				
			if(countries[row][0].equals("Boloivia")) {
				//System.out.println(countries[row][1]);
				if(countries[row][1].equals("La pass")) {
					System.out.println("Bolivia tesst passed");
				}else {
					System.out.println("Bolovia test failed");
				}
				break;
			}
			
			
		}
	}

}
