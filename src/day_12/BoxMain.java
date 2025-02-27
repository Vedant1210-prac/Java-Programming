package day_12;

public class BoxMain {

	public static void main(String[] args) {
		
		Box b = new Box();
		
		System.out.println(b.volume());
		
		Box b1 = new Box(1.1, 2.2, 3.3);
		
		System.out.println(b1.volume());
		
		b1= new Box(1.1);
		
		System.out.println(b1.volume());
		
		

	}

}
