package day_8;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s = "Dad";
		
		String palindrome = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			palindrome = palindrome + s.charAt(i);
		}
		
		if(palindrome.equals(s)) {
			
			System.out.println("Palindrome string");
		}else{
			
			System.out.println("not palindrome");
		}
		

	}

}
