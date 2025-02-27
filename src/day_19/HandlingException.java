package day_19;

import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Example 1
		/*System.out.println("Enter the Number:");
		
		int num = sc.nextInt();
		
		try {
		System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Invalid Data");
			System.out.println(e.getMessage());   //to know about more about exception
		}*/

		
		//Example 2
		
		int a [] = new int[5];
		
		System.out.println("Enter the position from 0 to 4");
		
		System.out.println("Enter the pos:");
		int pos = sc.nextInt();
		
		System.out.println("Enter the value:");
		int value = sc.nextInt();
		
		try {
		a[pos] = value;
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("User trying to add value in Index which more than Array Index value");
			
			System.out.println(e.getMessage());
			
		}
	}

}
