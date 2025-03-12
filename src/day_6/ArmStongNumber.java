package day_6;

public class ArmStongNumber {

	public static void main(String[] args) {

int num = 372; 
int orginalNum;
int remainder;
int result =0;

orginalNum=num;

while (orginalNum !=0) {
	remainder = orginalNum%10;
	result += Math.pow(remainder, 3);
	//result = result + Math.pow(remainder,3);
	orginalNum=orginalNum/10;
	
}

if(result==num) {
	System.out.println(num +" ArmStrong Number");
}else {
	System.out.println(num +" Not ArmStrong Number");
}

	}

}
