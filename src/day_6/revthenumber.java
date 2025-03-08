package day_6;

import java.util.Scanner;

public class revthenumber {

	public static void main(String[] args) {


		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		a = sc.nextInt();
		
		int numrev=0;
		
		while(a!=0) {
			
			numrev= numrev*10+ a%10;
			a = a/10;
			
		}
		System.out.println("Reverse number is " +numrev);
		
		int c = 1%10;
		System.out.println(c);
	}
	
	

}
