package day_7;

public class FindRepeatedNumberInArray {

	public static void main(String[] args) {
		
		
		int a[] = {10,10,20,30,40,50,20,40};
		
		for(int i=0; i<= a.length-1; i++) {
			
			for(int j = i+1; j<= a.length-1; j++) {
				
				if(a[i]==a[j]) {
					System.out.println("Repeated number is " +a[i] );
				}
			}
		}
		
	}

}
