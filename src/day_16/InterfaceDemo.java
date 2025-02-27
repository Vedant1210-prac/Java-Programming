package day_16;

interface shape{
	
	int length = 10;  //final and static
	int width = 20;  //final and static
	
	void circle();
	
	default void square() {
		
		System.out.println("square is a default method");
	}
	
	static void rectangle() {
		System.out.println("rectangle is a static method");
	}
}

public class InterfaceDemo implements shape {
	
	public void circle() {
		System.out.println("Circle is abstract method");
	}
	
	void triangle() {
		System.out.println("triangle is class method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scenario 1
		/*InterfaceDemo idobj = new InterfaceDemo();
		
		idobj.circle(); //abstract method
		idobj.triangle();		
		idobj.square();   //default method
		
		shape.rectangle();
		
		System.out.println(shape.length+ "  " +shape.width);
		System.out.println(idobj.length+ " " +idobj.width);  //static variable are common all the object
		*/
		
		//scenario 2 Data abstraction
		
		shape sobje = new InterfaceDemo();
		
		sobje.circle(); //abstract
		sobje.square(); //default method
		shape.rectangle();
		
		//sobje.triangle(); //cannot access
	}

}
