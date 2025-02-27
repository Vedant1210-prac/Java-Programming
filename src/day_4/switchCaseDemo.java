package day_4;

public class switchCaseDemo {

	public static void main(String[] args) {
		
		int weekNo=2;
		
		switch(weekNo) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default: System.out.println("Invalid number");
		}
	}

}
