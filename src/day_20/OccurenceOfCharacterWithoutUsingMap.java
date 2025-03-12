package day_20;

public class OccurenceOfCharacterWithoutUsingMap {

	public static void main(String[] args) {


		String s = "Vedant BhureV";
		
		for(int i = 0; i<s.length(); i++) {
			int count = 0;  // after completion of for loop count should strats with zero value again
			
			for(int j = 0; j<s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
				}
				
			}
			
			boolean print = false;
			
			for(int k = 0; k<i; k++) {
				if(s.charAt(k)== s.charAt(i)) {
					print = true;
				}
			}
			
			if(!print) {
			System.out.println(s.charAt(i)+":"+count);
			}
		}

	}

}
