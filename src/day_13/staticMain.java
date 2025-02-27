package day_13;

public class staticMain {

	public static void main(String[] args) {
		System.out.println(staticDemo.a);      // static method and variable we can access direclty with out creating object
			staticDemo.m1();  // we need to specify class name in which class we have mentioned static variable and method
				
				
				staticDemo st = new staticDemo();
				
				System.out.println(st.b);
				
				st.m2();
				
				
				st.m();
	}

}
