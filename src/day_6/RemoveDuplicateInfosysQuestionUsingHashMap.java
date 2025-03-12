package day_6;


import java.util.*;

public class RemoveDuplicateInfosysQuestionUsingHashMap {

	public static void main(String[] args) {

		 List<String> inputList = new ArrayList<>();
		 
		 inputList.add("1,Tom");
		 inputList.add("2,Jack");
		 inputList.add("3,Tom");
		 inputList.add("4,John");
		 inputList.add("5,David");
		 
		 Map<String, String> map = new HashMap<>();
		 
		 for(String list : inputList) {
			
			 String parts [] = list.split(",");
			 
			 String Num = parts[0];
			 String Name = parts[1];
			 
			 map.put(Name, Num);
			 
		 }
		 
		 System.out.println(map.keySet());
		 
		 System.out.println(map.values());

	}

}
