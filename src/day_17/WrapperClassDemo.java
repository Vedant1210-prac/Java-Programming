package day_17;

public class WrapperClassDemo {

	public static void main(String[] args) {


		//primitive data
		
		int x = 100; 
		double d= 10.5;
		char c = 'A';
		boolean b = true;
		
		//converting primitive data into Object   -Wrapper Class  -- Auto boxing
		 
		Integer iobj= x;  //object
		Double dobj = d;
		Character cobj = c;
		Boolean bobj = b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		
		
		//Converting object into primitive data unboxing
		
		int intvalue = iobj;
		double doublevalue= dobj;
		char charValue = cobj;
		boolean booleanValue = bobj;
		
		System.out.println(intvalue);
		System.out.println(charValue);
		System.out.println(doublevalue);
		System.out.println(booleanValue);
		
		
		
		
		
	}

}
