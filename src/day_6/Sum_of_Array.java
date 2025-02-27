package day_6;

public class Sum_of_Array {

	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 40, 50};
		
		int x=0;
		
		for(int i=0; i<=a.length-1; i++) {
			
			x= x+a[i];
			
			
		}
		System.out.println("Sum is "+ x);
		
	}

}
