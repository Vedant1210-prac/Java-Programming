package day_6;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {


		int num1 = 1;
		int num2 = 1;
		int num3= 0;
		int num;
		
		System.out.print(num3);
		System.out.print("," +num1);
		
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 0; i <=num; i++) {
			
			
			
			num3 = num1+num2;
			System.out.print("," +num3);
			num1 = num2;
			num2=num3;
			
		}
		
		

	}

}
