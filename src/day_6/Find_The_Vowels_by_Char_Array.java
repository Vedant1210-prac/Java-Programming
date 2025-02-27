package day_6;

import java.util.Scanner;

public class Find_The_Vowels_by_Char_Array {

	public static void main(String[] args) {

		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String s = sc.nextLine();
		
		System.out.println(s);
		
		char a [] = {'a', 'e','i', 'o', 'u'};
		
		String s1 = s.toLowerCase();
		
		for(int i=0; i<=s1.length()-1; i++) {
			
			for(int j=0; j<=a.length-1; j++) {
				
				if(s1.charAt(i)== a[j]) {
				
					System.out.println("Vowel is " +s1.charAt(i));
					count++;
				}
			}
		}
		
		System.out.println("Total vowels are "+count);

	}

}
