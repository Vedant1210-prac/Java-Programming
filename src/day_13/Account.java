package day_13;

public class Account {
	
	private int accountNo;
	private String name;
	private double amount;
	
	void setAccNo(int accountNo) {
		
		this.accountNo = accountNo;
		
	}
	
	int getAccNo() {
		
		return this.accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
