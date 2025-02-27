package day_8;

public class StringIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Showing 1 to 10 of 19081 (19 Pages)";
		
		//index of method
		
		int i = s.indexOf("(" )+1;
		System.out.println(i); 
		
		int j = s.indexOf("Pages")- 1;
		System.out.println(j); 
		
		System.out.println(s.substring(i, j));
		
		

	}

}
