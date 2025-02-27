package day_7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		
		
		int a[]= {4, 3, 1000, 100, 300, 1};
		
		System.out.println("Before Sorting " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting" +Arrays.toString(a));
		
		
		String b[] = {"a", "e","z", "k", "l", "b"};
		
		Arrays.sort(b);
		
		System.out.println("String Sorting" + Arrays.toString(b));
		
	}

}
