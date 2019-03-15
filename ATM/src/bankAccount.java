
public class bankAccount {
	
	private String cardNumber = "123456789"; 
	private String passCode = "123456789"; 
	private double balance;
	
	private String operation;
	private String amount;

	 bankAccount() {
		this.cardNumber = "123456789";
		this.passCode = "123456789";
		this.balance = 0.0;
		this.operation = null;
		this.amount = null;
		
	}

	
	bankAccount(double balance) {
		this.cardNumber = "123456789";
		this.passCode = "123456789";
		this.balance = balance;
		
	}
	
	
	public double getBalance() {
		return balance;
	}

	/**
	 * Withdrawing an amount of money
	 * @param amount, type of integer which is the amount to be withdrawn 
	 * @return balance, type of double which is the balance remained after withdrawn 
	 */
	public boolean withdraw(String amount) {
		
		if  (Integer.parseInt(amount) > this.balance)
			return false;

		else {
			balance -= Integer.parseInt(amount);
			return true;
		}
			
		
		}
		
	
	
	

	public void printData() {
		System.out.println("Card Number : "+ cardNumber);
		System.out.println("Balance  : "+ balance);
		
	}
	
	
	
	/**
	 * Inquiring about the account balance
	 * @param amount, type of integer which is the amount to be withdrawn 
	 * @return balance, type of double which is the balance remained after withdrawn 
	 */
	public double inquiry() {
		return balance;
	}
	
	
	/**
	 * Adding amount of money to the balance
	 * @param amount, type of integer which is the amount to be deposited 
	 * @return balance, type of double which is the balance remained after deposit 
	 */
	public void deposit(String amount) {
		balance += Integer.parseInt(amount);
	}
	
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	

}
