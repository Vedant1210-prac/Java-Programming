package day_6;

public class SwapTheNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {


		int a = 10;
		int b = 20;
		int c;
		System.out.println("Numbers before swaping a= " +a+ " And b= " +b);
		
		// with using third variable
		
		c=a;
		a=b;
		b=c;
		
		
		/*//swapping logic without using third variable
		a= a+b;
		b=a-b;
		a=a-b;
		*/
		System.out.println("Numbers After swaping a= " +a+ " And b= " +b);
		
		
		

	}

}
