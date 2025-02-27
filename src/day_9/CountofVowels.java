package day_9;

import java.util.Scanner;

public class CountofVowels {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		String s1 = s.nextLine();
		
		String s2 = s1.toLowerCase();
		
		int vowelcount = 0;
		
		int novowelcount = 0;
		
		for(int i=0; i<s1.length()-1; i++) {
			
			char c = s1.charAt(i);
			
			if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				
				vowelcount++;
				
			} else {
				 
				novowelcount++;
				
			}
			
		}
		
		System.out.println("Vowel count is "  +vowelcount);
		
		System.out.println(" no Vowel count is "  +novowelcount);
		
		
	}

}
