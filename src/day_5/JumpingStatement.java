package day_5;

public class JumpingStatement {

	public static void main(String[] args) {
		
		/*for(int i=1; i<=10; i++) {
			
			if(i==6) {
				break;
			}
			System.out.println(i);
		}*/
		
		/*for(int i=1; i<=10; i++) {
			if(i==6) {
				continue;              // skip 6 number
			}
			System.out.println(i);
		}*/
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
