package day_18;


class parent{
	 String name = "John";
	 
	 void m1() {
		 
		 System.out.println("m1 from parent class...");
		 
	 }
	 

	 
}


class child extends parent{
	
	int x = 100;
	
 void m2() {
	 		 
		 System.out.println("m2 from child class...");
		 
	 }
	
}

public class TypeCastingObject {

	public static void main(String[] args) {
		
		/*child c = new child();
		
		c.m1();
		
		c.m2();
		
		System.out.println(c.x);
		
		System.out.println(c.name);*/
		
		
		/*parent p = new child(); // upcasting 
		
		p.m1();    //parent 
		System.out.println(p.name);   //parent
		p.m2();   we can not access
		
		System.out.println(c.name);*/
		
		/*child c1 = (child)new parent();   //Downcasting
		
		c1.m1();
		c1.m2();
		
		System.out.println(c1.name);
		System.out.println(c1.x);*/
		
		
		
		
		
	}
	
	

}
