package day_6;

public class ArmStongNumberSimpleLogic {

	public static void main(String[] args) {


		int num = 153;
		
		int orginal = num;
		
		int reminder;
		
		int sum = 0;
		
		
		while(num > 0) {
			
			reminder = num % 10;
			
			sum = sum + (reminder * reminder * reminder);
			
			num = num/10;
		}
		
		System.out.println(sum);
	}
	

}
