package day_6;

import java.util.*;

public class RemoveTheDuplicateCharacterByKeepingTheSpaces {

	public static void main(String[] args) {


String s = "VVEEDDAANNT BBHHURE ZZYYDDEE";
        
        Set<Character> seenChars = new LinkedHashSet<>();
        String results = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == ' ') {
                // Append space as is, preserving all spaces
                results = results + ch;
            } else {
                // For non-space characters, add only if not already added
                if (!seenChars.contains(ch)) {
                    seenChars.add(ch);
                    results = results + ch;
                }
            }
        }
        System.out.println(results);


	}

}
