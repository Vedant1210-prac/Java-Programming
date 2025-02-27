package day_8;

import java.util.Arrays;

public class ObjectTypeOfArray {

	public static void main(String[] args) {
		
		
		Object a[] = new Object [5];
		
		a[0]= 100;
		a[1] ="John";
		a[3] = 'a';
		a[4]= true;
		a[2]= 12.53;
		
		Object b = Arrays.toString(a);
		
		System.out.println(b);
	}

}
