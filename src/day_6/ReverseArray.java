package day_6;

public class ReverseArray {

	public static void main(String[] args) {


		int a[]= {1,2,3,5,10,5};
		
		int left = 0;
		int right = a.length-1;
		
		while(right>left) {
			int temp = a[left];
			a[left] = a[right];
			a[right]=temp;
			left++;
			right--;
		}

		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
