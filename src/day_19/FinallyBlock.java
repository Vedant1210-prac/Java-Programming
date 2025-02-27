package day_19;

public class FinallyBlock {

	public static void main(String[] args) {


		String s = null;
		
		/*try {
		
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			
			System.out.println("Exception handled");
		}
		finally {
			
			System.out.println("Finally blocked executed");
		}*/
		
		try {
			
			System.out.println(s.length());
			}
			catch(ArithmeticException e) {
				
				System.out.println("Exception handled");
			}
			finally {
				
				System.out.println("Finally blocked executed");
			}
		
	}

}
