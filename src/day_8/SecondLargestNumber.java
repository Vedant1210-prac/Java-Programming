package day_8;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {


		int a[] = {1, 2, 4, 10, 5};
		 Arrays.sort(a);
		System.out.println();
		
		System.out.println("Second largest number" + a[a.length-2]);
	}

}
