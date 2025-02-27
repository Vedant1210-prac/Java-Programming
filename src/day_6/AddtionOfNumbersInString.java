package day_6;

import java.util.Scanner;

public class AddtionOfNumbersInString {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		String s1;
		
		System.out.println("Enter the String:");
		
		s1=sc.nextLine();
	
		int Sum=0;
		
	
		
		
		for(int i=0; i<=s1.length()-1; i++) {
			
			if(Character.isDigit(s1.charAt(i))) {
				
				int num = Character.getNumericValue(s1.charAt(i));
				
				Sum = Sum + num;
			}
		}
		
		System.out.println("Addition is: " +Sum);
		

	}

}
