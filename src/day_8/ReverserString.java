package day_8;

public class ReverserString {

	public static void main(String[] args) {


		String s = "I am working on java";
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0;i--) {
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		String rev1 = rev.replace(" ", "");
		System.out.println(rev1);
	}

}
