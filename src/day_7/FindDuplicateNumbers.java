package day_7;

import java.util.Scanner;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		
		int a[]= {10, 10, 20, 30, 40, 40};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int count =0;
		int fnum = sc.nextInt(); 
		
		
		for(int i=0; i<=a.length-1; i++) {
			
			
			if(fnum == a[i]) {
				count++;
			}
			
		}
		
		System.out.println("Repeated count is" +count);
		
		
	}

}
