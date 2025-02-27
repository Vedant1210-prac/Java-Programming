package day_20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		//Declaration
		
		ArrayList myList = new ArrayList();      // for heterogeneous data
		
		//List myList = new ArrayList();
		
		//ArrayList <Integer> myList = new ArrayList<Integer>();    //Only Integer type object it will store
		
		//ArrayList <String> myList = new ArrayList<String>();    //Only String type object it will store
		
		//Add data to ArrayList
		myList.add(100);
		myList.add("Welcome");
		myList.add('A');
		myList.add(null);
		myList.add(null);
		myList.add(100);
		myList.add(10.5);
		myList.add(100);
		
		
		//Size of Arraylist
		
	System.out.println(	"Size of arraylist "+ myList.size());
	
	//printing ArryList
	
	System.out.println("Printing ArrayList  " +myList);
	
	//remove the element from ArrayList
	myList.remove(4);
	
	
	
	System.out.println("Printing ArrayList after removing  " +myList);
	
	//Insert the element from ArrayList
	myList.add(3, true);
	
	System.out.println("Printing ArrayList after inserting  " +myList);
	
	//modify the element  (change/replace)
	
		myList.set(3, false);
		
		System.out.println("Printing ArrayList after modfying  " +myList);
		
		//Access the specific element from index
		
		Boolean a = (Boolean) myList.get(3);
		System.out.println(a);
		
		
		//Reading all the values from ArrayList
		
		//normal for loop
		
		for(int i = 0; i< myList.size(); i++) {
			
			System.out.println(myList.get(i));
		}
		
		
		//Using for...each loop
		
		for (Object x:myList) {
			System.out.println(x);
		}
		
		
		//Using Iterator
		Iterator it = myList.iterator();
		
		//System.out.println(it.next());   // only return first value
		//use While loop
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//Checking array List empty or Not
		System.out.println("Is the ArrayList empty? " +myList.isEmpty());
		
		//Remove the multiple ele from array list
		
		ArrayList mylist = new ArrayList();
		
		mylist.add(100);
		mylist.add("Welcome");
		
		myList.removeAll(mylist);
		
		System.out.println("After removing" +myList);
		

		
		
		
	}

}
