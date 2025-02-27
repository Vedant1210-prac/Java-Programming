package day_12;

public class Test {
	
	int number;
	
	void m1(int number) {
		
		number = number + 1;
		System.out.println("Value in the method " +number);
	}
	
	void m2(Test t) {
		 
		t.number = t.number + 10;
		
		System.out.println("Value in Class is " +t.number);
		
	}

}
