package day_9;

import java.util.Scanner;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
/*//String is Immutable
		String s = "Welcome";
		
		s.concat(" to Java");  //Just method it will not impact of existing value
		
		System.out.println(s); // welcome only
*/		
	
//StringBuffer Mutable
		
		/*StringBuffer s = new StringBuffer("welcome");
		
		s.append(" to Java");
		
		System.out.println(s);*/
		
//StringBuilder Mutable can change
		
		StringBuilder s= new StringBuilder("welcome");
		s.append(" to Java");
		
		System.out.println(s);
		
		Scanner s3 = new Scanner(System.in);
		
		String s4 = s3.next();
		System.out.println(s4);
		
	}

}
