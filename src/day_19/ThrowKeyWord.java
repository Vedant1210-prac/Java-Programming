package day_19;

public class ThrowKeyWord {
	
	void  checkSum(int num) {
		if(num<1) {
			throw new ArithmeticException("Number is negative, can not square");
		}
		else {
			System.out.println(num*num);
		}
	}

	public static void main(String[] args) {
		
		
		ThrowKeyWord t = new ThrowKeyWord();
		
		try {
		t.checkSum(-1);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
