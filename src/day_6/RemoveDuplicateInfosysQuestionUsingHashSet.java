package day_6;

import java.util.ArrayList;
import java.util.*;

public class RemoveDuplicateInfosysQuestionUsingHashSet {

	public static void main(String[] args) {

 List<String> inputList = new ArrayList<>();
		 
		 inputList.add("1,Tom");
		 inputList.add("2,Jack");
		 inputList.add("3,Tom");
		 inputList.add("4,John");
		 inputList.add("5,David");
		 
		//part[= { "1" , "Tom"}
		 Set<String> set = new LinkedHashSet<>();
		 
		 for(String list : inputList) {
			 
			 String parts[] = list.split(",");
			 String Name = parts[1];
			 
			 set.add(Name);
		 }
		 
		 System.out.println(set);
		 
	}

}
