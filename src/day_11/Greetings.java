package day_11;

public class Greetings {
	
	// 1) No Params No return values
	
	void m1() {
		
		System.out.println("Helloo....");
	}

	
	//2) No Params Return Values
	
	String m2() {
		
		return("Hello, welcome to Java");
	}
	
	//3) Take Params No Return Values
	
	void m3(String name) {
		System.out.println("Hello " +name);
	}
	
	String m4(String name){  // we have returned string thats why the type of method is String
		
		return("Hello " + name);
	}
}
