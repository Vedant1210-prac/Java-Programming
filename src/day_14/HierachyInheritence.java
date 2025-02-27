package day_14;

public class HierachyInheritence {
	
	int a;
	void display (int a) {
		this.a = a;
		
		System.out.println(this.a);
	}

}

class X extends HierachyInheritence{
	
	int b;
	void show (int b) {
		this.b = b;
		
		System.out.println(this.b);
	}
}

class Y extends HierachyInheritence
{
	int c;
	void show1 (int c) {

	this.c = c;
	
	System.out.println(this.c);
}
}
