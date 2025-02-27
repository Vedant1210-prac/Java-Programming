package day_9;

public class RemoveTheJunk {

	public static void main(String[] args) {


		String s= "wel@#%#$#%#come"; // remove the character give the output as welcome
		
		String x =s.replace("@#%#$#%#","");
		
		/*String a[] = s.split("@#%#$#%#");
		
		String x = a[0].concat(a[1]);*/
		
		System.out.println(x);
		
		
// Remove the spaces
		
		String s1 = "w   el come";
		String y = s1.replace(" ", "");
		System.out.println(y);
		
		

	}

}
