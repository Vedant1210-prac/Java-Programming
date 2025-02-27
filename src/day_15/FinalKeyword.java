package day_15;

public class FinalKeyword {
	
	final int x = 100;
	
	final void m1() {
		
		System.out.println("this is m1 method");
	
	}

}

final class test extends FinalKeyword {
	
	//final int x = 200;
	
	// we can not override the final keyword method 
	/*void m1() {
		
		System.out.println("this is m2 method");
	
	}
*/
}


/*class test2 extends test{
	// we can not extends the final class means inhertience is not applicable for final keyword
}
*/