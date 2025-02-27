package day_6;

public class twoDimentionalArray {

	public static void main(String[] args) {
		
		
		//1. Declaration 
		//Approach 1
		/*int a[][]= new int[3][2];
		
		a[0][0] = 100;
		a[0][1]= 200;
		a[1][0]= 300;
		a[1][1]= 400;
		a[2][0]= 500;
		a[2][1]= 600;*/
		
		//Approach 2
		
		int a[][]= {
				{100,200}, 
				{300, 400},
				{500,600}
				};
		
		// 2 Find the size of array
		
		System.out.println("Size of Rows " +a.length);  //Return the length of Array
		
		//For Colouns
		
		System.out.println("Size of Columns " +a[0].length);
		
		// 3 Reading the single values from Array
		System.out.println("Value is " +a[2][1]);
		
		/*// Reading Multiple values approach 1
		for(int i=0 ; i<=2 ; i++) {
			
			for(int j=0; j<=1; j++) {
				
				System.out.println("Values are " +a[i][j]);
			}
			
		}*/
		
		/*// Reading Multiple values approach 2
				for(int i=0 ; i<=a.length-1 ; i++) {
					
					for(int j=0; j<=a[2].length-1; j++) {
						
						System.out.print(a[i][j]+ " ");
					
					}
					
					System.out.println();
					
				}*/
		
		//Enchanced For loop
		
		for(int arr[] : a) {
			
			for(int x : arr) {
				System.out.print(x + " ");
			}
			
			System.out.println();
		}
	}

}
