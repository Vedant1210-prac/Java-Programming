package day_8;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
//String s = new String("Welcome");
		System.out.println(s);
		
		
//length() returns the length of the string

		int length = s.length();
		
		System.out.println(length);
		
//concate()  Joining of two String
		
		String s1 = "Welcome";
		String s2 = " to Java";
		String s3 = " Programming";
		
		System.out.println(s1+s2); // + operator is used to join the string Approach 1
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		
		String new1 = s1.concat(s2).concat(s3);
		
		System.out.println(new1);
		
//trim() remove spaces from right and left side
		
		String c = "   welcome   ";
		
		System.out.println("Before trimming " +c.length());
		
		String c1 = c.trim();
		
		System.out.println("After Trimming " +c1.length());
		
		
//charAt() returns character based on index
//index start from 0
		
		s ="welcome";
		
		System.out.println(s.charAt(3)); //C
		
		System.out.println(s.charAt(4));
		
		
//contains() returns true/false
//check the string is part of main string
		
		System.out.println(c1.contains("wel")); //true
		System.out.println(c1.contains("Come")); //false
		System.out.println(c1.contains("come")); // true
		System.out.println(c1.contains("welome")); // false
		
		
//equals() , equalsIgnoreCase() comapre 2 strings
//return true or false
		
		s1 = "Welcome";
		s2 = "Welcome";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals("welcome")); // false
		System.out.println(s1.equalsIgnoreCase(s2));
		
//replace() replace the string or character from main String
		

		s3 = " welcome to selenium java python pythone";
		
		System.out.println(s3.replace('l', 'X'));
		
		System.out.println(s3.replace("python", "C#"));
		
		
//SubString() extract the string from main string
		
	s1 = "welcome";
	System.out.println(s1.substring(0,3));
	System.out.println(s1.substring(2,6));
	
	
//toUpperCase()  toLowerCase()
	s = "Welcome";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	
	
	
//Split it will split the string in multiple parts based on delimeter
	
	s= "abcd#xyz";
	String a[]=s.split("#");
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	//EX
	s="$15,20,44";
	System.out.println(s.replace("$","").replace(",", ""));
	
	
	//EX2
	s="abc,123@xyz";
	
	/*String b[] = s.split(",");
	
	String x= b[0];
	String y = b[1];
	
	String z[]= y.split("@");
	
	System.out.println(x);
	System.out.println(z[0]);
	System.out.println(z[1]);*/
	
	System.out.println(s.split(",")[0]);
	System.out.println(s.split(",")[1].split("@")[0]);
	System.out.println(s.split(",")[1].split("@")[1]);
	
	
	//Problem
	
	String name= "John XyZ";
	
	System.out.println(name.contains("john"));
	
	System.out.println(name.toLowerCase().contains("john"));
	
	System.out.println(name.replace("J","j").contains("john"));
	
	
		
		
	
		
		
		

	}

}
