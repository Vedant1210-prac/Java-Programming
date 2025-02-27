package day_18;

//A b = C d

public class TypeCastingObject2 {

	public static void main(String[] args) {
		
//Ex1
		
		/*Object o = new String("welcome");
		
		StringBuffer sb = (StringBuffer) o;  */ //rule 1 valid , rule 2 valid, rule 2 invalid
		
//Ex2
		
		/*Object o = new StringBuffer("welecom");
		
		String s = (StringBuffer) o;*/      // rule 1-- passed    rule 2 -- failed
		
		
//Ex3 
		Object o = new StringBuffer("welcome");
		
		StringBuffer sb = (StringBuffer) o;
		
		System.out.println(sb);
		
		
		
	}

}
