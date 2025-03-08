package day_20;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccurenceOfCharacter {

	public static void main(String[] args) {


		String s = "I amd 34 old and 29 old";
		
		HashMap<Character, Integer> countOfChar = new HashMap();
		
		char a[]= s.toCharArray();
		for(char ch:a) {
			
			if(ch!=' ') {
				
				countOfChar.put(ch, countOfChar.getOrDefault(ch, 0)+1);
			}
			
		}
			
		for(Entry<Character, Integer> entry : countOfChar.entrySet() ) {
			
			System.out.println(entry.getKey()+ ":" + entry.getValue());
			
		}
	}

}
