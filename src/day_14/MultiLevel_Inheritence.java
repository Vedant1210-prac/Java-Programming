package day_14;

public class MultiLevel_Inheritence {

	
	int a;
	void display() {
		
		System.out.println(a);
	}
	
}

class A extends MultiLevel_Inheritence{
	
	int b;
	
	void show() {
		System.out.println(b);
	}
}

class C extends A{
	
	int c;
	
	void show1() {
		System.out.println(c);
	}
}
