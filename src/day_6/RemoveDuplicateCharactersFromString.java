package day_6;

import java.util.*;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {


		String s = "VVEEDDAANNT BBHHURE ZZYYDDEE";
		
		Set<Character> stringchar = new LinkedHashSet<>();
		
		String results="";
		
		
		for(int i = 0; i<s.length(); i++) {
			
			
			
				
				
			stringchar.add(s.charAt(i));
			
		
		}
		
		//need to define the list after adding the values in HashSet if we declare this above before add then it will return the empty string
		
		
		List<Character> charList = new ArrayList<>(stringchar);
		
		for(int j = 0; j<charList.size(); j++) {
			if(charList.get(j)==' ') {
				results = results + charList.get(j);
			}else {
			
				results = results + charList.get(j);
			}
			
		}

		System.out.println(results);
	}

}
