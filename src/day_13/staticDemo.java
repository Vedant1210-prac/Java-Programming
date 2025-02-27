package day_13;

public class staticDemo {
	
	static int a= 10; //static variable
	int b= 20;		  // non static variable
	
	static void m1() {
		
		System.out.println("m1 is static method");
	}
	
	void m2() {
		System.out.println("m2 is non static method");
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}

	/*public static void main(String[] args) {


		//System.out.println(a);      // static method and variable we can access direclty with out creating object
		//m1();
		
		System.out.println(b);  it is non static variable and method we can not access directly we need to create object
		m2();
		
		staticDemo st = new staticDemo();
		
		System.out.println(st.b);
		
		st.m2();
		
		
		st.m();
		
		

	}*/

}
