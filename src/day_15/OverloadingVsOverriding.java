package day_15;

class ABC{
	
	void m1(int a) {
		
		System.out.println(a);
	}
	
void m2(int b) {
		
		System.out.println(b);
	}

}

class XYZ extends ABC{
	
void m1(int a) {  				//overriding only body of the method we changed
		
		System.out.println(a*a);
	}

void m2(int b) {
	
	System.out.println(b*b);    
}

void m2(int b, int a) {   //overloading
	
	
	System.out.println(a*b);    
}

}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		XYZ xyzobj = new XYZ();
		
		xyzobj.m1(10);
		xyzobj.m2(2);
		xyzobj.m2(10, 5);

	}

}
