package day_13;

public class AccountMain {

	public static void main(String[] args) {


		Account acc = new Account();
		
		acc.setAccNo(103021);
		acc.setName("John");
		acc.setAmount(12344.44);
		
		System.out.println(acc.getName()+ "  " +acc.getAccNo()+ "   " +acc.getAmount());

	}

}
