package day_20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration
		
		//HashMap hm = new HashMap();
		
		//Map myMap = new HashMap();
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
		//Adding pairs
		
		hm.put(101, "John");
		hm.put(102, "Yash");
		hm.put(103, "Mary");
		hm.put(104, "David");
		hm.put(102, "AJ");
		hm.put(null, "BV2");
		hm.put(null, "BV1");
		
		
		System.out.println("HashMap is " +hm);
		
		System.out.println(hm.size());
		
		//Removing the pair
		
		hm.remove(104);
		
		System.out.println("After removing key HashMap is " +hm);
		
		//Accessing the pair from Map
		System.out.println(hm.get(102));
		
		//only keys in set format
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		
		
		//Reading the data from HashMap
		
		//for each...
		
		/*for(int k : hm.keySet()) {
			
			System.out.println(k+ "  " + hm.get(k));
		}
		*/
		
		//Using Iterator
		
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Entry<Integer, String> entry =it.next();
			System.out.println(entry.getKey()+ "  " +entry.getValue());
		}
		
		//hm.clear();
		
		System.out.println(hm.isEmpty());

	}

}
