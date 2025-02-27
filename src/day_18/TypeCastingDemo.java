package day_18;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting lower value to higher value
		
		/*int intvalue = 100;
		
		long longvalue = intvalue;
		
		System.out.println(longvalue);
*/
		
		/*float floatvalue = 10.5f;
		
		double doublevalue = floatvalue;
		
		System.out.println(doublevalue);
		*/
		
		//Downcasting higher value to lower value
		
		
		long longvalue = 1000000;
		
		int intvalue = (int)longvalue;      //called as casting
		
		System.out.println(intvalue);
		
		double doublevalue = 12344667789.99;
		
		float floatvalue = (float) doublevalue;
		
		System.out.println(floatvalue);
		
	}

}
