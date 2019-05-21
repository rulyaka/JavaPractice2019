package day47;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.ArrayList;
import static java.time.LocalDateTime.now;

public class Staticimports {
	public static void main(String[] args) {

		System.out.println(PI); // число пи
		System.out.println(max(10, 5));
		System.out.println(min(10, 3));
		System.out.println(floor(2.6444));
		System.out.println(round(12.5));
		System.out.println(abs(-10));
		System.out.println((10.4));
		System.out.println(random() * 10);

		System.out.println(isDigit('3'));

		int[] nums = { 23, 234, 12, 214, 221, 23 };
		sort(nums);
		
		System.out.println(now());

	}
}
