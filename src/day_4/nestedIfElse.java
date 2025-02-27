package day_4;

public class nestedIfElse {

	public static void main(String[] args) {
		
		if(1==1) {
			
			if(2==1) {
				System.out.println("ABC");
			}else {
				System.out.println("1234");      //always need to write else condition when we are writing nested if
			}
		}else {
			if(3==3) {
				System.out.println("XYZ");
			}
		}
	}

}
