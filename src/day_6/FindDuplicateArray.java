package day_6;

import java.util.Arrays;

public class FindDuplicateArray {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,5};
		int b[]= {5,2,3,4,1};
		boolean status = false;
		
		//Arrays.
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		/*for(int i = 0; i<a.length; i++) {
			
			for(int j = 0; j<b.length; j++) {
				
				if(a[i]== b[j]) {
					
					status = true;
				}else {
					status = false;
				}
			}
		}
		
		if(status== true) {
			
			System.out.println("Both Arrays are similar");
		}else {
			
			System.out.println("Both Arrays are not similar");
		}*/
		if (Arrays.equals(a, b)) {
            System.out.println("Both Arrays are similar");
        } else {
            System.out.println("Both Arrays are not similar");
        }
	
	}
	
	

}
