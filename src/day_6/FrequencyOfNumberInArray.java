package day_6;

import java.util.Arrays;

public class FrequencyOfNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a [] = {1,1,4,4,3,3,3,5};
		
		Arrays.sort(a);
		
		
		
		for(int i= 0; i<a.length; i++) {
			int count =1;
			while(i<a.length-1 && a[i]==a[i+1]) {
				
				count++;
				i++;
			}
			
			System.out.println(a[i]+"->" +count);
		}
	}

}
