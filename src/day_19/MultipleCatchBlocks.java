package day_19;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Programm Started..");
		
		String s = null;
		
		try {
		
		System.out.println(s.length());
		
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		/*catch(NullPointerException e) {
			
			System.out.println("NullPointer Exception handled...");
		}
		catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException handled...");
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException handled...");
		}*/
	}

}
