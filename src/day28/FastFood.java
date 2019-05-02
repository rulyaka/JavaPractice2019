package day28;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFood {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);

		// System.out.println(data[0]);// wil print first row
		// System.out.println(data[1]);
///	System.out.println(data[data.length -1]); // last row
		int counter = 0;
		for (String restaurant : data) {
			System.out.println("#" + counter + "=>" + restaurant);
			counter++;

		}
		int countVa = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println(row);
				countVa++;
			}

		}
		System.out.println("#### Total restaurants in VA: " + countVa);

		

		for (String res : data) {
			if (res.contains(",VA,")) {
				
				String[] resArr = res.split(",");
				System.out.println(resArr[2]+" - "+resArr[1]);
			}

		}
		System.out.println("");
	}
}