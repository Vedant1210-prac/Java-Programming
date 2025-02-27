package day_6;

public class ReverseOnlyBigWords {

	public static void main(String[] args) {


		String input = "I am 34 Years Old and fan of Cricket";
		
		String[] word = input.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String words : word) {
			if(words.length()>3) {
				result.append(new StringBuilder(words).reverse()).append(" ");
				
			}else {
				result.append(words).append(" ");
			}
		}
		
		System.out.println(result);
	}

}
