package day_11;

public class ConstructorDemo {
	
	int x, y;
	
	ConstructorDemo(){  //default constructor - we can not write 2 default constructor in same class
		
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a, int b){  //Parameterized constructor
		
		x=a;
		y=b;
		
	}
	
	void sum() {
		
		System.out.println(x+y);
	}

}
