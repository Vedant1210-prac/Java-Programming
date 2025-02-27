package day_12;

public class OverloadingTheMainMethod {
	
	void main(int a) {
		
		System.out.println(a);
	}
	
	void main(int a, int b) {
		
		System.out.println("Sum " + (a+b));
	}

	public static void main(String[] args) {
		
		//for calling the main method we need to create the object
		
		OverloadingTheMainMethod ov = new OverloadingTheMainMethod();
		
		ov.main(10);
		
		ov.main(21, 20);

	}

}
