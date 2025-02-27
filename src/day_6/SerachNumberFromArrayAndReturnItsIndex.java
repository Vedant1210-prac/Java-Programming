package day_6;

import java.util.Scanner;

public class SerachNumberFromArrayAndReturnItsIndex {

	public static void main(String[] args) {


		int a[]= {1,2,3,5,10,5};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int fnum = sc.nextInt();
		
		boolean found = false;
		
		for (int i = 0; i<=a.length-1; i++) {
			
			if(fnum==a[i]) {
				
				System.out.println("The number is present at the index of "
						+ "" +i);
				found = true;
				
			}
		}

		if(found==false) {
			System.out.println("Number is not present in Array");
		}
	}

}
