package day_6;

public class CountofCharacter_and_Number_fromString {

	public static void main(String[] args) {


		String s = "I amd 34 old and 29 old";
		
		int countOfChar = 0;
		int countofnumber = 0;
		int countofspaces = 0;
		
		
		for(int i = 0; i<=s.length()-1; i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				
				countofnumber++;
			}
			else if(s.charAt(i)==' ') {
					countofspaces++;
				}
			else {
				countOfChar++;
				
			}
			
		}
		
		System.out.println("Count of number in string "+countofnumber);
		System.out.println("Count of character in string " +countOfChar);
		System.out.println("Count of spaces in string " +countofspaces);
	}
	
	

}
