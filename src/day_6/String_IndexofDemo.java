package day_6;

public class String_IndexofDemo {

	public static void main(String[] args) {


		String s = "Hello 12 World";
		
		
		 int intial_index =s.indexOf(" ") + 1;
		 
		 System.out.println(intial_index);
		 
		 System.out.println(s.substring(6));
		 
		 int last_index = s.indexOf("World")-1;
		 
		 System.out.println(last_index);
		 
		 System.out.println(s.substring(intial_index,last_index ));
		 

	}

}
