package day_17;

import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String ----> Int
		
		String s1= "100";
		String s2= "200";
		
		int Sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		System.out.println(Sum);
		
		
		//String ----> double
		
		String s4 = "10.5";
		String s3 = "20.5";
		
		double SumOfD = (Double.parseDouble(s4) + Double.parseDouble(s3));
		
		System.out.println(SumOfD);
		
		
	/*	//String -----> Char // can not convert String to Char
		
		String s5 = "A";
	*/	
		
		
		//String ----> boolean
		
		String s5 = "true";
		
		Boolean.parseBoolean(s5);
		
		
//Scenario 2  int, double, boolean, char ----> String
		
/*		int x = 100;
		
		String s = String.valueOf(x);
		
		char a[] = s.toCharArray();
		
		
		
		double y = 10.5;
		
		String str = String.valueOf(y);
		
		
		char z = 'A';
		
		String str1 = String.valueOf(z);
		
		
		boolean val = true;
		
		String str2 = String.valueOf(val);
		
*/		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
