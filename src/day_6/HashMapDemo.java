package day_6;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap<String, Integer> Map1 = new HashMap<>();
		HashMap<String, Integer> Map2 = new HashMap<>();
		HashMap<String, Integer> Map3 = new HashMap<>();
		
		Map1.put("A", 1);
		Map1.put("B", 2);
		Map1.put("C", 3);
		
		System.out.println(Map1);
		
		Map2.put("B", 2);
		Map2.put("C", 4);
		Map2.put("D", 5);
		
		System.out.println(Map2);
		
		Map3.put("D", 1);
		Map3.put("B", 2);
		Map3.put("F", 3);
		
		System.out.println(Map3);
		
		//Common entries
		
		HashMap<String, Integer> CommonMap = new HashMap<>(Map1);
		
		CommonMap.entrySet().retainAll(Map2.entrySet());  //return the common key and value
		CommonMap.entrySet().retainAll(Map3.entrySet());
		
		System.out.println("Common Enteries are " +CommonMap);
		
		//Union
		
		HashMap<String, Integer> unionmap = new HashMap<>(Map1);
		unionmap.putAll(Map2);  //combined the all maps 
		unionmap.putAll(Map3);
		System.out.println("Union of all " +unionmap);
		
		
		//UNIQUE VALUE
		
		HashMap<String, Integer> UniqueMap= new HashMap(Map1);
		UniqueMap.entrySet().removeAll(Map2.entrySet());
		UniqueMap.entrySet().removeAll(Map3.entrySet());
		
		System.out.println("Unique value " +UniqueMap);
		
	}

}
