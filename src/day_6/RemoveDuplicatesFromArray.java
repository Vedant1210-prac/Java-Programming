package day_6;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {


		int a[] = {5,6,7,3,3,7,5};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i = 0; i<=a.length-1; i++) {
			
			set.add(a[i]);
		}

		System.out.println(set);
	}

}
