package day_3;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithemtic Operators
		
		int a= 10, b=5;
	
		System.out.println("Sum of a and b is " +(a+b));
		System.out.println("Subtraction of a and b is " +(a-b));
		System.out.println("Multiplication of a and b is " +(a*b));
		System.out.println("Division of a and b is " +(a/b));
		System.out.println("Modulo of a and b is " +(a%b));
		
		
		//Relational Operators
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		//Logical Operator
		
		boolean b1 = 10>20;
		
		System.out.println(b1);
		
		
		boolean b2= 10<20;
		
		System.out.println(b2);
		
		
	boolean result = b1 && b2;
	
	System.out.println(result);
	
	boolean result1 = b1 || b2;
	
	System.out.println("Result is " +result1);
	
	
		
		
		
		

	}

}
