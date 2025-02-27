package day_7;

public class Highest_and_Lowest_Number {

	public static void main(String[] args) {
		
		int[] a= {1, 900, 2, 300, 400, 1000};
		
		int highest = a[0];
		int lowest = a[0];
		
		/*for(int x : a) {
			
			if(x>highest) {
				
				highest = x;
				
			}
			
			if(x<lowest) {
				
				lowest = x;
				
				
			}
		}*/
		
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]>highest) {
				highest = a[i];
			}
			
			if(a[i]<lowest) {
				lowest = a[i];
			}
		}
		
		System.out.println("Highest Number is " +highest);
		
		System.out.println("Lowest number is " +lowest);

	}

}
