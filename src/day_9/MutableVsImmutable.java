package day_9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {


		int a[] = {10,30,50,23,90};
		int b[] = a;
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(b));
		
		
		

	}

}
