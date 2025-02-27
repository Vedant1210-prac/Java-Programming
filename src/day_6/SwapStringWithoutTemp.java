package day_6;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {


		String s1 ="Hello";
		String s2 ="Java";
		
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		s2 = s1.substring(0, s1.length()-s2.length());
		
		System.out.println(s2.substring(3));
		
		
		s1 = s1.substring(s2.length());
		
		System.out.println("After swapping the s1 string is " +s1);
		System.out.println("After swapping the s2 string is " +s2);
	}

}
