package day_6;

public class ReverseTheBigWordsOnlyWithOutUsingStringBuffer {

	public static void main(String[] args) {


		String input = "I am 34 Years Old and fan of Cricket";
		
		String words [] = input.split(" ");
		
		String result ="";
		
		for(int i = 0; i<words.length; i++) {
			
			String word = words[i];
			if(word.length() > 4) {
				String rev = "";
				for(int j = word.length()-1; j>=0; j--) {
							
				rev= rev + word.charAt(j);
				
				}
				
				result = result + rev;
			}
			else {
				
				result = result + word;
			}
			
			if(i < words.length -1) {
				result = result + " ";
			}
			
		}
		
		System.out.println(result);

	}

}
