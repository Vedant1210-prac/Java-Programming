package day_6;

public class ReverseStringUsingWhileLoop {

	public static void main(String[] args) {


		String s = "Java is";
		
		String rev ="";
		
		int i = s.length()-1;
		while(i>=0) {
			
			rev= rev + s.charAt(i)+" ";
			
			i--;
		}
		
		System.out.println(rev);

	}

}
