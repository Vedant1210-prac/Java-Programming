package day_5;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int rem, rev=0;
		for(int Num=123; Num != 0; Num= Num/10 ) {
			rem = Num % 10;
		 rev= rev*10+rem;
		}
		System.out.println(rev);
	}

}
