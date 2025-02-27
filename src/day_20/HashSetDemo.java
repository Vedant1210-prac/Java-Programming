package day_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {


		//Decalration
		//Heterogeneous data
		HashSet mySet = new HashSet();
		
		//Set mySet = new HashSet();
		
		//Homogeneous data
		
		//HashSet<String> mySet = new HashSet<String>();
		
		
		//adding the elements in HashSet
		mySet.add(100);
		mySet.add("welcome");
		mySet.add('A');
		mySet.add(null);
		mySet.add(null);
		mySet.add(100);
		mySet.add(10.5);
		
		//printing hashSet
		System.out.println(mySet);
		
		//removing element
		
		mySet.remove(10.5);
		
		System.out.println("After removing " +mySet);
		
		//Insertion is not possible in Hashing method
		
		//Accessing specific value in Set Not Possible
		
		
		//Convert HashSet into ArrayList
		
		ArrayList myList = new ArrayList(mySet);
		
		System.out.println("Converted HasSET in ArrayList " + myList);
		
		System.out.println("get index value "  +myList.get(2));
		
		//Size of HashSet
		
		System.out.println(mySet.size());
		
		
		//Read the Data from Set
		
		//normal for loop is not possible
		
		//with enhanced for loop or for each
		
		/*for(Object x:mySet) {
			
			System.out.println("Read the data " +x);
		}*/
		
		
		//with Iterator
		
		Iterator it = mySet.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		 
		
		
		
		
	}

}
