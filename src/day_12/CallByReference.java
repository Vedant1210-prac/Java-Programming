package day_12;

public class CallByReference {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.number = 100;
		
		System.out.println("Before Method " +t1.number);
		
		t1.m2(t1);
		
		System.out.println("After Method " +t1.number);
		
	}

}
