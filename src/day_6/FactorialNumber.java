package day_6;

import java.util.Scanner;

public class FactorialNumber {

	

	

	public static void main(String[] args) {

		int num;
		//int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		num = sc.nextInt();
		
		int fact = 1;
		
		/*for (int i = 1; i <= num; i++) {
            fact *= i;
        }*/
		
		for( int i = 1; i<=num; i++){
			
			fact = fact*i;
		}
			System.out.println(fact);
	}

}
