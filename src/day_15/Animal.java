package day_15;

public class Animal {
	
	String color = "White";
	
	void eat() {
		
		System.out.println("eating .....");
	}
	
	Animal(){
		
		System.out.println("This is Animal.");
	}
	
Animal(String name){
		
		System.out.println("This is " +name);
	}

}


class Dog extends Animal{
	
	String color = "Black";
	
	void DisplayColor() {
		
		System.out.println(color);
		
		System.out.println(super.color);   // super keyword used to invoke the immediate parent class varaible value
		
	}
	
void eat() {
		
		//System.out.println("eating bread");
		super.eat();   //super keyeord we can use for methods as well
		
	}

Dog(){
	super();  // invoke the parent class construstor
	System.out.println("This is Dog.");
	
}
	
	Dog(String name){
		super(name);
	}
	
	
}
