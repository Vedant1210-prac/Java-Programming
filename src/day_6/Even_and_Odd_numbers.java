package day_6;

public class Even_and_Odd_numbers {

	public static void main(String[] args) {
		
		int a[]= {10, 2, 3, 4, 5};
		
		int even=0;
		int odd=0;
		
		
		for(int i=0; i<= a.length-1; i++ ) {
			
			if(a[i]%2==0) {
				
				even++;
			}else {
				
				odd++;
			}
			
		}
		
		System.out.println("total even numbers " +even);
		
		System.out.println("total odd numbers " +odd);
		
	}

}
