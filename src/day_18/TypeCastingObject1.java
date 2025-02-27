package day_18;

// Cat ct = (Cat) an;
//  A  b     C    d

class Animal{}

class Cat extends Animal{}

class Dog extends Animal{}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		
		
		//Rule 1 Conversion is valid or not
		
		// Type of d and c must have some relationship
		/*Animal an = new Dog();
		
		Cat ct = (Cat) an; *///  valid as per Rule 1
		
		/*Dog dg = new Dog();
		Cat ct = (Cat)dg;*/   //invalid as per the rule
		
		
		//Rule 2 Assignment is valid or not
		//C must be either same or child of A
		
		/*Animal an  = new Dog();
		Cat ct = (Cat) an;*/ // valid as the rule 2
		
		/*Animal an = new Dog();
		
		Cat ct = (Dog) an;*/    //invalid as the rule 2
		
		
		//Rule 3 
		//The underlying object type of 'd' must be either same or child of 'C'
		
		/*Animal an = new Dog();
		
		Cat ct = (Cat) an;*/  //valid as per rule 3
		
		
		
		
	}

}
