package day_6;

public class FindTheCommonNumbersInArray {

	public static void main(String[] args) {


		int a[]= {2,1,2,3,4,5,5,4};
		//int b[]= {4,5,6,2,8,9};
		int total_Number=0;
		
		for(int i=0; i<=a.length-1;i++) {
			
			for(int j=i+1; j<=a.length-1; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[i]+" is present in both arrays");
					total_Number++;
				}
			}
			
		}
		
		System.out.println(total_Number);
		

	}

}
