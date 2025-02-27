package day_6;

public class Palindrome_Number {

	public static void main(String[] args) {


		int num = 171;
		int original = num;
		
		int pal =0;
		
		while(num!=0) { 
			
			pal = pal*10 + num%10;
			num = num/10;
		}
		
		System.out.println(pal);
		
		if(original==pal) {
			System.out.println("Palindrome");
			
		}
	}
	
}



