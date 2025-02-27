package day_7;

import java.util.Scanner;

public class Searching_The_Number {

	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 40, 50};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int srch_num = sc.nextInt();
		boolean status = false;
		
		for(int i=0; i<a.length - 1; i++) {
			
			if(srch_num==a[i]) {
				
				System.out.println("Element found");
				status = true;
				
				break;   //to break the if condition once the number is found
			}
		}
		
		if(status == false) {
		System.out.println("Element not found");
		}
	}

}
