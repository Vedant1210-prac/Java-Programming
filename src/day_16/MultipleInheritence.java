package day_16;

public class MultipleInheritence implements I1,I2 {
	
	public void m1() {
		System.out.println("this is m1");
	}
	
	public void m2() {
		
		System.out.println("this is m2");
	}

	public static void main(String[] args) {


		MultipleInheritence mi = new MultipleInheritence();
		 mi.m1();
		 mi.m2();
		 
		 System.out.println(mi.x);
		 System.out.println(mi.y);
		

	}

}
