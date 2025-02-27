package day_9;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		
		/*String s ="Selenium";
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse String " +rev);*/
		
//Method 2 by converting String to Array
		
		/*String s = "Selemium";
		
		String rev ="";
		
		char a[]= s.toCharArray(); //convert the String into Array
		
		System.out.println(Arrays.toString(a));
		
		for(int i = a.length-1 ; i>=0; i--) {
			
			rev = rev + a[i];
		}
		
		System.out.println("Reverse String " +rev);*/
		
//Method 3 StringBuffer
		
		StringBuffer s = new StringBuffer("Welcome");
		
		System.out.println("Reverese String is : " +s.reverse());
		
//Methode 4 Stringbuilder
		
		StringBuilder x= new StringBuilder("Selenium");
		
		System.out.println("Reverse String using StringBuilder method :" +x.reverse());
		
	}

}
