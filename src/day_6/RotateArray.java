package day_6;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {


		int a[]= {1,2,3,5,4};
		
		int b[] = new int[a.length];
		
		for(int i = 0 ; i<=a.length-1; i++) {
			
			b[i]=a[a.length-1-i];
			
		}
		
		System.out.println(Arrays.toString(b));
		
		
	}

}
