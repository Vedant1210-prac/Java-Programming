package day_6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

 
		int num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		
		if(count ==2) {
			System.out.println("Number is Prime Number");
		}else {
			System.out.println("Number is not Prime Number");
		}
		

	}

}
