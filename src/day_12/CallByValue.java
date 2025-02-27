package day_12;

//passing copy of variable
public class CallByValue {

	public static void main(String[] args) {
		
		int number = 100;
		
		System.out.println("Before Method " +number);
		
		
		Test t = new Test();
		
		t.m1(number);
		
		System.out.println("After method " +number);
		
		
		

	}

}
