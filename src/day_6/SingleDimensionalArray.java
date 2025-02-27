package day_6;

import java.util.Arrays;

//import java.lang.reflect.Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//int a[]= {1,2,3,4,5};
		
		System.out.println("Size of array "  + a.length);
		
		
	  System.out.println("First number is " +a[0]);
		
		//Reading multiple values of Array		
	  	//System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		//enhanced for loop only for Array
		/*for(int x:a) {
			System.out.println(x);
		}
*/
	}

}
