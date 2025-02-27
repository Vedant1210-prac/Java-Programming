package day_6;

public class Palindrome_Array {

	public static void main(String[] args) {


		int a[] = {1, 2, 3, 2, 1};
		
		boolean status = true;
		
		
		for(int i=a.length-1; i>=0; i--) {
			
			if(a[i] != a[a.length-1-i]) {
				
				status = false;
				break;
			}
			
		}

		if(status==true) {
			System.out.println("palindrome array");
		}else {
			
			System.out.println("Not a palindrome array");
		}
	}

}
