package day_6;

import java.util.Arrays;

public class ArrayThirdLargestNumberAndSmallestNumber {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6,7,8};
		int b[]= {10,20};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		/*for(int i=a.length-1; i>=0; i--) {
			
			if(i==2) {
				System.out.println("ThirdLargest "+a[i]);
				break;
			}
			
		}
		
		for(int j=b.length-1; j>=0; j--) {
			
			if(j==2) {
				System.out.println("ThirdLargest "+b[j]);
				break;
			}
			
		}
		
for(int i=a.length-1; i>=0; i--) {
			
			if(i==0) {
				System.out.println("Smallest of a "+a[i]);
				break;
			}
			
		}
		
		for(int j=b.length-1; j>=0; j--) {
			
			if(j==0) {
				System.out.println("Smallest of b "+b[j]);
				break;
			}
			
		}*/
		
		System.out.println("Smallest in a : " + a[0]);

        // Third largest element (if at least 3 elements exist)
        if (a.length >= 3) {
            System.out.println("Third Largest in a: " + a[a.length - 3]);
        } else {
            System.out.println("Array has less than 3 elements.");
        }
        
        System.out.println("Smallest in a : " + b[0]);

        // Third largest element (if at least 3 elements exist)
        if (b.length >= 3) {
            System.out.println("Third Largest in a: " + b[b.length - 3]);
        } else {
            System.out.println("Array has less than 3 elements.");
            System.out.println("Third Largest in a: " + b[0]);
        }
		

	}

}
